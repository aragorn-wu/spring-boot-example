package com.git.wuqf.controller;

import com.git.wuqf.mapper.UserMapper;
import com.git.wuqf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/{name}/{age}", method = RequestMethod.POST)
    public @ResponseBody
    int createUser(@PathVariable String name, @PathVariable int age) {
        return userMapper.insert(name, age);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public @ResponseBody
    User getUsers(@PathVariable String name) {
        return userMapper.findByName(name);
    }
}
