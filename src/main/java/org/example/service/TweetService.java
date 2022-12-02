package org.example.service;

import org.example.entity.PairReturn;
import org.example.entity.Tweets;
import org.example.entity.User;
import org.example.repository.TweetRepository;

public class TweetService {
    private static final TweetRepository tweetRepository = new TweetRepository();

    public boolean tweeting(Tweets tweets){
        return tweetRepository.addTweet(tweets);
    }

    public boolean removeTweet(Tweets tweets){
        return tweetRepository.removeSingleTweet(tweets);
    }

}
