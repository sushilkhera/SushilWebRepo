package com.sushil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sushil.service.LoginService;
import com.sushil.bean.User;
import com.sushil.dao.LoginDao;

@Service(value="loginServiceImpl")
public class LoginServiceImpl implements LoginService {

	@Autowired
	@Qualifier("loginDaoImpl")
	public LoginDao loginDao;
	
	public User loginAuthenticate() {
		// TODO Auto-generated method stub
		return loginDao.getUser();
	}

}
