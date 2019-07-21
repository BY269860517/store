package com.by.stroeconsumers.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.store.common.pojo.User;
import com.store.common.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    private UserService userService;
    @GetMapping("/people")
    public User getPeople() {
        User people = new User();
        people.setPassword("打发打发");
        return userService.getUser(people);
    }

}
