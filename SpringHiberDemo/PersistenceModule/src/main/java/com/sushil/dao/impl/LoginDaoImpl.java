package com.sushil.dao.impl;

import org.springframework.stereotype.Repository;

import com.sushil.bean.User;
import com.sushil.dao.LoginDao;

@Repository(value="loginDaoImpl")
public class LoginDaoImpl implements LoginDao{

	public User getUser() {
		User user = new User();
		user.setuName("Tom");
		return user;
	}

}
