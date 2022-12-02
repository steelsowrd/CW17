package org.example.service;

import org.example.entity.Tweets;
import org.example.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TweetServiceTest {

    @Test
    void tweeting() {
        User user = new User();
        user.setId(1);
        Tweets tweets = new Tweets();
        tweets.setTweet("HW13");
        tweets.setUser(user);
        TweetService tweetService = new TweetService();
        assertTrue(tweetService.tweeting(tweets));
    }

    @Test
    void removeTweet() {
        Tweets tweets = new Tweets();
        tweets.setId(9);
        TweetService tweetService = new TweetService();
        assertFalse(tweetService.removeTweet(tweets));
        tweets.setId(11);
        assertTrue(tweetService.removeTweet(tweets));
    }
}