package com.yonyou.springcloudapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration//配置控制  
@EnableAutoConfiguration//启用自动配置  
@ComponentScan(value={"com.yonyou.springcloudapp"})//组件扫描
@EnableDiscoveryClient
@EnableEurekaClient
public class EnableEurekaClientApplication2 {
	public static void main(String[] args) {   
        //第一个简单的应用，   
        SpringApplication.run(EnableEurekaClientApplication2.class,args);
    }   
}
