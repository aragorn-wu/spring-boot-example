package com.git.wuqf.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wuqf on 17-2-19.
 */
@Component
@ConfigurationProperties(prefix="project")
public class ProjectProperties {

//    @Value("${project.name}")
    private String name;
//    @Value("${project.target}")
    private String target;
//    @Value("${project.desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
