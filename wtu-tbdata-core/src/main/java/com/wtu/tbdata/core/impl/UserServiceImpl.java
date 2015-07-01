package com.wtu.tbdata.core.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.wtu.tbdata.common.util.log.LogAnnotation;
import com.wtu.tbdata.core.UserService;
import com.wtu.tbdata.dal.UserDao;
import com.wtu.tbdata.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	/** The user dao. */
	@Resource(name="userDao")
	private UserDao userDao;
	
	@LogAnnotation
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	public void insert() throws SQLException {
		List<User> list = null;
		try {
			User user = new User();
			user.setUsername("zero");
			user.setPassword("ll_zero");
			list = userDao.getUserList();
			userDao.insert(user);
			userDao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		System.out.println(list.get(0).getUsername());
			
	}

}
