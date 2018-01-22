package com.yonyou.springcloudapp.controllers;


import com.yonyou.springcloudapp.itf.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class HelloContorller {

    @Autowired
    private ServiceHello serviceHello;

    @RequestMapping("/hello")
    public String test() {
        return serviceHello.sayHellow("hello");
    }

}
