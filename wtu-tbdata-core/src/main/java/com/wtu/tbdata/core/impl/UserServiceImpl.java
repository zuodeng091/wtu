package com.wtu.tbdata.core.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wtu.tbdata.core.UserService;
import com.wtu.tbdata.dal.UserDao;
import com.wtu.tbdata.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	/** The user dao. */
	@Resource(name="userDao")
	private UserDao userDao;
	
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	
	

}
