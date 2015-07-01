package com.wtu.tbdata.core;

import java.sql.SQLException;
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
	
	public void insert() throws SQLException;

}
