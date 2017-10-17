package com.git.wuqf.controller;

import com.git.wuqf.dao.UserServiceImpl;
import com.git.wuqf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wuqf on 17-2-19.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/{name}/{age}",method = RequestMethod.POST)
    public @ResponseBody  int createUser(@PathVariable String name,@PathVariable int age) {
        return userService.create(name,age);
    }

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public @ResponseBody
    List<User> getUsers(@PathVariable String name) {
        return userService.getUser(name);
    }
    }
