package com.qidian.dao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.qidian.entity.User;

@Repository
@Transactional
public class UrserDAO extends BaseDAO {
	
	@Transactional
	public void initData() {
		User user = new User();
		user.setName("管理员");
		user.setLoginName("admin");
		this.manager.persist(user);
		this.manager.flush();
		Assert.notNull(user.getId(), "用户ID不能为空！");
	}

}