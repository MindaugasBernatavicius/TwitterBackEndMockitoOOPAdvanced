package com.twitter.analyticsengine;

import com.twitter.core.dao.message.TweetDao;
import com.twitter.core.model.message.Tag;
import com.twitter.core.model.message.Tweet;
import com.twitter.core.model.user.Sex;
import com.twitter.core.model.user.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class TweetAnalyticsTest {

    private static final String AUTHOR_NAME = "Mindaugas";
    TweetAnalytics tweetAnalytics;
    TweetDao mockTweetDao;
    Tweet[] tweets;

    @Before
    // Given / Arrange
    public void setup(){
        tweetAnalytics = new TweetAnalytics();
        mockTweetDao = mock(TweetDao.class);
    }

    @After
    // Teardown
    public void teardown(){
        tweetAnalytics = null;
        mockTweetDao = null;
        tweets = null;
    }

    @Test
    // [name oftested method]_[expected input / tested state]_[expected behavior]
    public void getAvgTweetLength_givenListOfTweets_returnsCorrectAvg(){
        // Given / Arrange
        tweets = new Tweet[]{
            new Tweet(2, "A",
                new User(AUTHOR_NAME, "m1ndas", 29, Sex.Male),
                new String[]{"http://URL1","http://URL2"},
                null,null),
            new Tweet(2, "AB",
                new User(AUTHOR_NAME, "m1ndas", 29, Sex.Male),
                new String[]{"http://URL1","http://URL2"},
                null,null),
            new Tweet(2, "ABC",
                new User(AUTHOR_NAME, "m1ndas", 29, Sex.Male),
                new String[]{"http://URL1","http://URL2"},
                null,null),
            new Tweet(2, "ABCDEFX",
                new User(AUTHOR_NAME, "m1ndas", 29, Sex.Male),
                new String[]{"http://URL1","http://URL2"},
                null,null),
        };

        Mockito
            .when(mockTweetDao.getAllTweets())
            .thenReturn(tweets);

        // When / Act
        double avgLen = tweetAnalytics.getAvgTweetLenght(mockTweetDao);

        // Then / Assert
        Assert.assertEquals(3.25, avgLen, 0);
        Mockito.verify(mockTweetDao, times(1)).getAllTweets();
    }

    @Test
    public void getCountsPerStatus_givenEnumsetOfTweetsWStatuses_returnCorrectCountPerStatus(){
        // given
        List<Tweet> ageRestricted = new ArrayList<>(List.of(
                new Tweet(66, "Text from first tweet - age restricted", null, null, null, null),
                new Tweet(3, "Text from second tweet - age restricted", null, null, null, null),
                new Tweet(789, "Text from third tweet - age restricted", null, null, null, null)
        ));

        List<Tweet> approvedByMach = new ArrayList<>(List.of(
                new Tweet(2, "Text from first tweet - approvedByMach", null, null, null, null)
        ));

        EnumMap<Tweet.TweetStatus, List<Tweet>> tweetsWStatuses = new EnumMap<>(Tweet.TweetStatus.class){{
            put(Tweet.TweetStatus.AGE_RESTRICTED, ageRestricted);
            put(Tweet.TweetStatus.APPROVED_BY_MACHINE_PENDIGN_HUMAN_REVIEW, approvedByMach);
        }};

        // when
        Mockito.when(mockTweetDao
                .getAllTweetsGroupedByStatus())
                .thenReturn(tweetsWStatuses);

        EnumMap<Tweet.TweetStatus, Integer> countPerStatus = tweetAnalytics.getCountsPerStatus(mockTweetDao);

        // then
        Assert.assertEquals(ageRestricted.size(), (long)countPerStatus.get(Tweet.TweetStatus.AGE_RESTRICTED));
        Assert.assertEquals(approvedByMach.size(), (long)countPerStatus.get(Tweet.TweetStatus.APPROVED_BY_MACHINE_PENDIGN_HUMAN_REVIEW));
        Mockito.verify(mockTweetDao, times(1)).getAllTweetsGroupedByStatus();
    }

//    @Test
//    public void getAvgTweetLength_givenNullList_throwsException(){}

//    @Test
//    public void getAvgTweetLength_givenNullList_throwsException(){}
}
