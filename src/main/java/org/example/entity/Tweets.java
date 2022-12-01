package org.example.entity;

import javax.persistence.*;

@Entity
public class Tweets extends BaseEntity{
    @ManyToOne
    private User user;
    private String tweet;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public String toString() {
        return "Tweets{" +
                "user=" + user +
                ", tweet='" + tweet + '\'' +
                '}';
    }
}
