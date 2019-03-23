package com.twitter.core.model.message;

import com.twitter.core.model.user.User;

public class Tag {
    private String tagText = "";
    private User author = null;

    public Tag(String tagText,
               User author) {
        this.tagText = tagText;
        this.author = author;
    }

    public String getTagText() {
        return tagText;
    }

    public void setTagText(String tagText) {
        this.tagText = tagText;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}