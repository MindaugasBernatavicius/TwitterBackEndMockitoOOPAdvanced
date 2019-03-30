package com.twitter.core.model.message;

import com.twitter.core.model.user.User;

public class SimpleTag implements Comparable<SimpleTag>{
    private String tagText = "";
    private String author = null;

    public SimpleTag(String tagText,
                     String author) {
        this.tagText = tagText;
        this.author = author;
    }

    public String getTagText() {
        return tagText;
    }

    public void setTagText(String tagText) {
        this.tagText = tagText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean equals(Object st){
        SimpleTag otherTag = (SimpleTag) st;
        if (author.equalsIgnoreCase(((SimpleTag) st).author) &&
            tagText.equalsIgnoreCase(((SimpleTag) st).tagText)){
            return true;
        } else {
            return false;
        }
//        return author.equalsIgnoreCase(((SimpleTag) st).author);
    }

    @Override
    public int compareTo(SimpleTag st) {
        return author.length() - st.author.length();
    }
}