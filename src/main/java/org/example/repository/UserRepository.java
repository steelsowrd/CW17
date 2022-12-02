package org.example.repository;

import org.example.config.DataBaseConfig;
import org.example.entity.User;
import org.hibernate.*;

import javax.management.Query;
import java.util.List;

public class UserRepository {
    public Long create(User user){
        long id;
        Session session = DataBaseConfig.getSessionFactory().openSession();
        session.beginTransaction();
        id = (Long) session.save(user);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    public User getUserByUsername(String username){
        User user = new User();
        Session session = DataBaseConfig.getSessionFactory().openSession();
        var query =
                session.createQuery("select u from User u where u.userName=:username", User.class)
                        .setParameter("username", username);
        List<User> list = query.list();
        session.close();
        if (list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    public boolean removeUser(User user){
        Session session = DataBaseConfig.getSessionFactory().openSession();
        User rmUser = session.get(User.class, user.getId());
        session.beginTransaction();
        session.delete(rmUser);
        session.getTransaction().commit();
        session.close();
//        System.out.println(user);
//        System.out.println(rmUser);
        return true;
    }


}
