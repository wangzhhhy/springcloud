package com.yonyou.springcloudapp.controllers;

import com.yonyou.springcloudapp.itf.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@Autowired
	private ServiceHello serviceHello;
	@RequestMapping("/test")
	public String hellow() {
		return serviceHello.sayHellow("hello");
	}

}
