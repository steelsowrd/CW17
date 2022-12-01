package org.example.service;

import org.example.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    static UserService userService = new UserService();
    static User user = new User();
    @BeforeAll
    static void setUp() {
        user.setUserName("El2");
        user.setPassword("bel");
        user.setNumber("09126152367");
        user.setEnterDate();
        user.setName("jimbel");
    }

    @AfterAll
    static void tearDown() {
    }

    @Test
    void signUp() {
        Assertions.assertTrue(userService.signUp(user));
    }
}