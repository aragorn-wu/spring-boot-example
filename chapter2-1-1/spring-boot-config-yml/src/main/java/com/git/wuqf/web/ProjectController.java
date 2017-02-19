package com.git.wuqf.web;

import com.git.wuqf.service.ProjectProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuqf on 17-2-19.
 */
@RestController
public class ProjectController {
    @Autowired
    private ProjectProperties projectProperties;

    @RequestMapping("/project/desc")
    public String projectDesc(){
        return projectProperties.getDesc();
    }
}
