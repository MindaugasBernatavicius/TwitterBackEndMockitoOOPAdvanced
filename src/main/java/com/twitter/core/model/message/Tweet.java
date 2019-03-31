package com.twitter.core.model.message;

import com.twitter.core.model.user.User;

public class Tweet extends Message {
    private static final int LIMIT_FOR_LENGTH = 160;
    // aggregation / compossition
    private Image[] images = null;
    private Tag[] tags = null;

    public Tweet(int numberOfTimesResent,
                 String text,
                 User author,
                 String[] hyperlinks,
                 Image[] images,
                 Tag[] tags) {
        super(numberOfTimesResent, text, author, hyperlinks);
        this.images = images;
        this.tags = tags;
    }

    public static int getLimitForLength() {
        return LIMIT_FOR_LENGTH;
    }

    // We don't need setters for final fields, they are constants
    // public static void setLimitForLength(int limitForLength) {
    //    Tweet.limitForLength = limitForLength;
    //}

    // methods that are not specific to this child class
    // can be removed b/c they will be inherited from the parent
    // public String getText() {
    //    return super.getText();
    // }

    @Override
    public void setText(String text) throws Exception {
        // TODO :: implement custom exceptions
        if (text.length() < 1)
//            throw new Exception("Tweent can not be shorter than: 1");
            throw new TweetLenghtException("Tweent can not be shorter than: 1");
        if (text.length() > LIMIT_FOR_LENGTH)
//            throw new Exception("Tweent can not be longer than: " + LIMIT_FOR_LENGTH);
            throw new TweetLenghtException("Tweent can not be longer than: " + LIMIT_FOR_LENGTH);
        super.text = text;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    // inner type
    public enum TweetStatus {
        PENDING_REVIEW,
        APPROVED_BY_MACHINE_GOOD,
        APPROVED_BY_MACHINE_PENDIGN_HUMAN_REVIEW,
        APPROVED_BY_HUMAN_GOOD,
        AGE_RESTRICTED,
        BANNED
    }
}


