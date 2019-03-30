package com.twitter.core.dao.message;

import com.twitter.core.model.message.Tag;
import com.twitter.core.model.message.Tweet;
import com.twitter.core.model.user.User;

import java.util.EnumMap;
import java.util.List;

public class TweetDao {
    public Tweet[] getAllTweets() {
        // TODO :: need implementation
        return null;
    }
    public Tweet[] getAllTweetsByAuthorName(User author) {
        // TODO :: need implementation
        return null;
    }
    public Tweet[] getAllTweetsByTag(Tag tag) {
        // TODO :: need implementation
        return null;
    }
    public EnumMap<Tweet.TweetStatus, List<Tweet>> getAllTweetsGroupedByStatus(){
        // TODO :: need implementation
        return null;
    }
}