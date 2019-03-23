package com.twitter.analyticsengine;

import com.twitter.core.dao.message.TweetDao;

public interface TweetAnalyticsI {
    double getAvgTweetLenght(TweetDao ts);
    double getAvgTweetTagCount(TweetDao ts);
    double getCountOfTweetsByTag(TweetDao ts);
    double getCountOfTweetsWProfanity(TweetDao ts);
}