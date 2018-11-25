package com.qidian.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * * @ClassName: SpringBootDemoHelloApplication 
* @Description:
* SpringBootDemoHelloApplication.java 是SpringBoot应用程序入口，或者叫主程序。
* 注解@SpringBootApplication 标注他是一个SpringBoot应用，main方法使他成为一个主程序，将在应用启动时首先被执行。
* 注解@RestController 标注这也是一个控制器。
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月25日下午9:25:06
 * @功能描述：
 */
@EnableTransactionManagement
@SpringBootApplication
@RestController
public class SpringBootDemoHelloApplication extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String hello(){
        return "hello boot";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoHelloApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(SpringBootDemoHelloApplication.class);
    }
}