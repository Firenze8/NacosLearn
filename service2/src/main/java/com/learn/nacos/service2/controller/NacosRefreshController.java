package com.learn.nacos.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosRefreshController {
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/refreshconfigs")
    public String getConfigs(){
        return applicationContext.getEnvironment().getProperty("common.name");
    }
}
