package com.wtu.tbdata.dal.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wtu.tbdata.dal.UserDao;
import com.wtu.tbdata.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	/** The sqlmap client. */
	@Resource(name="sqlmapClient")
	private SqlMapClient sqlmapClient;

	public List<User> getUserList() {
		try {
			//使用ibatis的sqlmap查询
			List<User> list = sqlmapClient.queryForList("user.getUserList");
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
