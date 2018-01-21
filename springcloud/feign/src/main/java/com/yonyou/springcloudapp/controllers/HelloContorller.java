package com.yonyou.springcloudapp.controllers;


import com.yonyou.springcloudapp.itf.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {

    @Autowired
    private ServiceHello serviceHello;

    @RequestMapping("/test")
    public String test() {
        return serviceHello.sayHellow("test");
    }

}
