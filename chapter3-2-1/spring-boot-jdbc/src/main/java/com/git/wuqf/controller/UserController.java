package com.git.wuqf.controller;

import com.git.wuqf.dao.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wuqf on 17-2-19.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/{name}/{age}",method = RequestMethod.GET)
    public @ResponseBody  int createUser(@PathVariable String name,@PathVariable int age) {
        return userService.create(name,age);
    }
}
