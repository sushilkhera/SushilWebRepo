/**
 * 
 */
package com.sushil.service;

import org.springframework.stereotype.Service;

import com.sushil.bean.User;

/**
 * @author sushilkhera
 *
 */
@Service
public interface LoginService {
	public User loginAuthenticate();
}
