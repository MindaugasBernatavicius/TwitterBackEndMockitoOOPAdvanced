package com.twitter.analyticsengine;

import com.twitter.core.dao.message.TweetDao;
import com.twitter.core.model.message.Tweet;

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
}
