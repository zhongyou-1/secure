package com.qidian.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qidian.comm.Result;
import com.qidian.comm.Results;
import com.qidian.entity.User;

/***
 * 
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月26日下午7:02:11
 * @功能描述：测试类
 */
@RestController
@RequestMapping("/")
public class DemoController {

	protected static Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@RequestMapping("/hello")
    @ResponseBody
	public Result hello(){
		
		return Results.SUCCESS.build("hello word");
	}
	
 
	
}
