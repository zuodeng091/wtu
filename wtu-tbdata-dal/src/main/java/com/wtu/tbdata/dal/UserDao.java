package com.wtu.tbdata.dal;

import java.sql.SQLException;
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
	
	public void insertUser(User user) throws SQLException;
	
	public void insert(User user) throws SQLException;

}
