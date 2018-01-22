package com.yonyou.springcloudapp.bs;

import com.yonyou.springcloudapp.itf.ServiceHello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ServiceHelloImpl implements ServiceHello {
    @Value("${server.port}")
    int port;
    public String sayHellow(String name) {
        return name+"2:"+port;
    }
}
