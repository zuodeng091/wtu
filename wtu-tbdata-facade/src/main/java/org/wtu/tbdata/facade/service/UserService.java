package org.wtu.tbdata.facade.service;

import com.wtu.tbdata.domain.WtuUser;


/**
 * The Interface UserService.
 */
public interface UserService {
	
	/**
	 * 根据用户名获取用户信息
	 * @param name
	 * @return
	 */
	public WtuUser getUserByName(String name);

}
