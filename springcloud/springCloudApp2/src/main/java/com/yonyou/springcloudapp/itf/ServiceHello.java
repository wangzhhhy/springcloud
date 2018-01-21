package com.yonyou.springcloudapp.itf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello")
public interface ServiceHello {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String sayHellow(@RequestParam(value = "name") String name);
}
