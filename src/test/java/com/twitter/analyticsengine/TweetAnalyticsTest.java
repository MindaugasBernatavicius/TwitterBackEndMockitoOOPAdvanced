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
            new Tweet(2, "ABCD",
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
        Assert.assertEquals(3, avgLen, 0);
        Mockito.verify(mockTweetDao, times(1)).getAllTweets();
    }
}
