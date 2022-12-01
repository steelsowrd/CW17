package org.example.service;

import org.example.entity.User;
import org.example.repository.UserRepository;

import javax.management.Query;

public class UserService {
    private static final UserRepository userRepository = new UserRepository();

    public boolean signUp(User user) {
        try {
            return userRepository.create(user) != null;
        } catch (Exception e) {
            return false;
        }
    }

    public Long login(String userName, String password){
        User user;
        user = userRepository.getUserByUsername(userName);
        if (user.getPassword().equals(password)){
            System.out.println("welcome");
            return user.getId();
        } else {
            System.out.println("not welcome");
            return null;
        }
    }
}
