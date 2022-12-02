package org.example.repository;

import org.example.config.DataBaseConfig;
import org.example.entity.Tweets;
import org.hibernate.Session;

import java.util.Objects;

public class TweetRepository {
    public boolean addTweet(Tweets tweets) {
        Session session = Objects.requireNonNull(DataBaseConfig.buildSessionFactory()).openSession();
        try {
            session.beginTransaction();
            session.save(tweets);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeSingleTweet(Tweets tweets) {
        try {
            Session session = Objects.requireNonNull(DataBaseConfig.buildSessionFactory()).openSession();
            Tweets rmTweet = session.get(Tweets.class, tweets.getId());
            session.beginTransaction();
            session.delete(rmTweet);
            session.getTransaction().commit();
            session.close();
            System.out.println(rmTweet);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
