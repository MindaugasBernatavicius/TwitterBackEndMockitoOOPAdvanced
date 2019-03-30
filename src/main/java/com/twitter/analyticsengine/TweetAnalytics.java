package com.twitter.analyticsengine;

import com.twitter.core.dao.message.TweetDao;
import com.twitter.core.model.message.Tweet;

import java.util.EnumMap;
import java.util.List;

public class TweetAnalytics implements TweetAnalyticsI {
    public double getAvgTweetLenght(TweetDao tdao) {
        Tweet[] allTweets = tdao.getAllTweets();

        // Implement average calculation
        int sumOfLenghts = 0;
        for(int i = 0; i < allTweets.length; i++){
            sumOfLenghts += (allTweets[i]).getText().length();
        }

        return (double)sumOfLenghts / allTweets.length;
    }

    public double getAvgTweetTagCount(TweetDao tdao) {
        return 0;
    }

    public double getCountOfTweetsByTag(TweetDao tdao) {
        return 0;
    }

    public double getCountOfTweetsWProfanity(TweetDao tdao) {
        return 0;
    }

    public EnumMap<Tweet.TweetStatus, Integer> getCountsPerStatus(TweetDao tdao){
        EnumMap<Tweet.TweetStatus, List<Tweet>> listByStatus = tdao.getAllTweetsGroupedByStatus();

        EnumMap<Tweet.TweetStatus, Integer> countPerStatus = new EnumMap<>(Tweet.TweetStatus.class);
        for (Tweet.TweetStatus key : listByStatus.keySet()) {
            countPerStatus.put(key, listByStatus.get(key).size());
        }

        // then we would count the list items in the List<Tweet>
        return countPerStatus;
    }
}
