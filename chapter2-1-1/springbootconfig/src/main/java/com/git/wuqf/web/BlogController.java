package com.git.wuqf.web;

import com.git.wuqf.service.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuqf on 17-2-19.
 */
@RestController
public class BlogController {

    @Autowired
    private BlogProperties blogProperties;

    @RequestMapping("/blog/desc")
    public String getDesc(){
        return blogProperties.getDesc();
    }
}
