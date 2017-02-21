package com.git.wuqf.dao;

import com.git.wuqf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuqf on 17-2-19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(String name, int age) {
        return jdbcTemplate.update("insert into user(name, age) values(?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from user WHERE name=?", name);
    }

    @Override
    public int updateUser(String name, int age) {
        return jdbcTemplate.update("UPDATE user set age =? WHERE name=?", age, name);

    }

    @Override
    public int getUserCount() {
        return jdbcTemplate.update("select count(*) from user");
    }

    @Override
    public List<User> getUser(String name) {
       List user= jdbcTemplate.queryForList("SELECT  * from user WHERE name=?",name);
        return user;
    }
}
