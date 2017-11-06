package com.sushil.dao;

import org.springframework.stereotype.Repository;

import com.sushil.bean.User;

@Repository
public interface LoginDao {
	public User getUser();
}
