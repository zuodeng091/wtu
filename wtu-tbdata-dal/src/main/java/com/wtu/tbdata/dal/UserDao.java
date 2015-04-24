package com.wtu.tbdata.dal;

import java.util.List;

import com.wtu.tbdata.domain.User;

/**
 * The Interface UserDao.
 */
public interface UserDao {
	
	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	public List<User> getUserList();

}
