package com.yonyou.springcloudapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	
	@RequestMapping("/hello")
	public String hellow() {
		String getConf="hello, sping Cloud!2222";
		return getConf;
	}

}
