package com.twitter.core.model.message;

import com.twitter.core.model.user.User;

public class Comment extends Message {

    // aggregation / compossition
    private Tweet parentTweet;

    public Comment(int numberOfTimesResent,
                   String text, User author,
                   String[] hyperlinks,
                   Tweet parentTweet) {
        super(numberOfTimesResent, text, author, hyperlinks);
        this.parentTweet = parentTweet;
    }
}
