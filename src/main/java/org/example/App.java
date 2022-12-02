package org.example;

import org.example.config.DataBaseConfig;
import org.example.entity.Tweets;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.service.TweetService;
import org.example.service.UserService;
import org.hibernate.Session;

import java.util.logging.Level;

public class App {
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
//
//        Session session = DataBaseConfig.getSessionFactory().openSession();
//        session.beginTransaction();

//        User user = new User();
//        user.setId(1);
//        user = session.load(User.class, 1L);
//        System.out.println(user);
//        user.setName("Mahdi");
//        user.setEnterDate();
//        user.setUserName("El_Mammad");
//        user.setNumber("09120832025");
//        user.setPassword("1234");
//        System.out.println(user);
//        Tweets tweets = new Tweets();
//        tweets.setUser(user);
//        tweets.setTweet("Salam");
//        session.save(user);
//        session.save(tweets);
//        tweets = session.get(Tweets.class, 6L);
//        session.getTransaction().commit();
//        System.out.println(tweets);
//        session.close();


//        List<Tweets> list = session.createQuery("select t from Tweets t where t.user.id=:id", Tweets.class).setParameter("id", 1L).getResultList();
//        System.out.println(list);

//        User user = new User();
//        user.setUserName("El");
//        user.setPassword("bel");
//        user.setNumber("09126152365");
//        user.setEnterDate();
//        user.setName("jimbel");
//        UserService userService = new UserService();
//        System.out.println(userService.signUp(user));
//        System.out.println(userService.login(user.getUserName(), user.getPassword()));

//        Session session = DataBaseConfig.getSessionFactory().openSession();
//        User user = new User();
//        user.setId(1);
//        UserService userService = new UserService();
//        UserRepository userRepository = new UserRepository();
//        System.out.println(userRepository.removeUser(user));

//        User user = new User();
//        user.setId(1);
//        Tweets tweets = new Tweets();
//        tweets.setTweet("HW13");
//        tweets.setUser(user);
//        TweetService tweetService = new TweetService();
//        tweetService.tweeting(tweets);

        Tweets tweets = new Tweets();
        tweets.setId(9);
        TweetService tweetService = new TweetService();
        System.out.println(tweetService.removeTweet(tweets));


    }
}
