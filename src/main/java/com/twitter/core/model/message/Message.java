package com.twitter.core.model.message;

import com.twitter.core.model.user.User;

public class Message {
    private int numberOfTimesResent;
    protected String text;
    // aggregation / compossition
    private User author;
    private String[] hyperlinks = null;

    public Message(int numberOfTimesResent,
                   String text, User author,
                   String[] hyperlinks) {
        this.numberOfTimesResent = numberOfTimesResent;
        this.text = text;
        this.author = author;
        this.hyperlinks = hyperlinks;
    }

    public int getNumberOfTimesResent() {
        return numberOfTimesResent;
    }

    public void setNumberOfTimesResent(int numberOfTimesResent) {
        this.numberOfTimesResent = numberOfTimesResent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws Exception {
        if (text.length() < 1)
            throw new Exception("Tweent can not be shorter than: 1");
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String[] getHyperlinks() {
        return hyperlinks;
    }

    public void setHyperlinks(String[] hyperlinks) {
        this.hyperlinks = hyperlinks;
    }
}
