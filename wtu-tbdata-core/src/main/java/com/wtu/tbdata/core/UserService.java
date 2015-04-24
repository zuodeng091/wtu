package com.wtu.tbdata.core;

import java.util.List;

import com.wtu.tbdata.domain.User;

/**
 * The Interface UserService.
 */
public interface UserService {
	
	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	public List<User> getUserList();

}
