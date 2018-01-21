package com.yonyou.springcloudapp.itf;

import com.yonyou.springcloudapp.bs.ServiceHelloImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello",fallback = ServiceHelloImpl.class)
public interface ServiceHello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHellow(@RequestParam(value = "name") String name);
}
