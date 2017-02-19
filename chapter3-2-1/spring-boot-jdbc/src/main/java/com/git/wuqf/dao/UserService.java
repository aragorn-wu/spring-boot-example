package com.git.wuqf.dao;

import com.git.wuqf.model.User;

import java.util.List;

/**
 * Created by wuqf on 17-2-19.
 */
public interface UserService {

    int create(String name, int age);

    void deleteByName(String name);

    int updateUser(String name, int age);

    int getUserCount();

    List<User> getUser(String name);
}
