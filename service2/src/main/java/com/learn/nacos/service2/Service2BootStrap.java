package com.learn.nacos.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service2BootStrap {
    public static void main(String[] args) {
        SpringApplication.run(Service2BootStrap.class, args);
    }


    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/configs")
    public String getConfigs(){
        return applicationContext.getEnvironment().getProperty("common.name");
    }

}
