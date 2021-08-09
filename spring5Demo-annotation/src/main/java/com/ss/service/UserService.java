package com.ss.service;

import org.springframework.stereotype.Component;

// <bean id = "userService" class = "" />
@Component(value = "userService")
public class UserService {

     public void add() {
        System.out.println("service add");
    }

}

