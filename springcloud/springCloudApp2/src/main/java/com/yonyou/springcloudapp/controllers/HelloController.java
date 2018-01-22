package com.yonyou.springcloudapp.controllers;

import com.yonyou.springcloudapp.itf.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	ServiceHello serviceHello;
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return serviceHello.sayHellow(name);
	}
}
