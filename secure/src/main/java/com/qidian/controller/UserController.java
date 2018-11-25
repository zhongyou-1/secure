/*package com.qidian.controller; 
 

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qidian.dao.UrserDAO;
import com.qidian.entity.User;

*//**
 * @ClassName: UserController
 * @Description: User控制器
 * @author mengfanzhu
 * @date 2017年2月20日 下午5:58:19
 *//*
@RestController
@RequestMapping("/user")
//@MapperScan(value = "com.demo.mapper")
public class UserController {

	protected static Logger logger = LoggerFactory.getLogger(UserController.class);

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private UrserDAO dataDAO;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		logger.debug("访问getUserByName,Name={}");
		List<User> list = em.createQuery("select o from User o ", User.class).getResultList();
		logger.error("----------info," + list.size());
		return "name is 大家好 ";
	}

	@RequestMapping("/demo/{name}")
	@ResponseBody
	public String demoShowName(@PathVariable String name) {
		logger.debug("访问getUserByName,Name={}", name);
		return "name is " + name;
	}

	*//**
	 * http://localhost:9090/user/initdata @Title: UserController @Description:
	 * 数据初始化 @author mengfanzhu @throws
	 *//*
	@RequestMapping("/initdata")
	@ResponseBody
	public String initData() {
		dataDAO.initData();
		return "success";
	}
 
	*//**
	 * 分页 Page page = new Page().resetFromIndex(indexpage.intValue());
	 * 
	 * TypedQuery<MallActivitySkuInfo> hq = manager.createQuery(buff.toString(),
	 * MallActivitySkuInfo.class); List<MallActivitySkuInfo> list = hq
	 * .setFirstResult(page.getOffset()).setMaxResults(page.getRowsInPage())去除分页
	 * .setParameter("acticityId", activityId) .setParameter("type",
	 * type).getResultList();
	 *//*
}*/