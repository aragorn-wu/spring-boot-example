package com.git.wuqf.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wuqf on 17-2-19.
 */
@Component
public class BlogProperties {
    @Value("${com.git.wuqf.name}")
    private String author;

    @Value("${com.git.wuqf.blog}")
    private String name;

    @Value("${com.git.wuqf.blog.desc}")
    private String desc;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
