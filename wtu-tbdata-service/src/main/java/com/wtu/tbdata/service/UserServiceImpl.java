package com.wtu.tbdata.service;


import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.wtu.tbdata.facade.service.UserService;

import com.wtu.tbdata.common.util.log.LogAnnotation;
import com.wtu.tbdata.dal.mapper.WtuUserMapper;
import com.wtu.tbdata.domain.WtuUser;
import com.wtu.tbdata.domain.WtuUserExample;
import com.wtu.tbdata.domain.WtuUserExample.Criteria;

@Service("userService")
@LogAnnotation
public class UserServiceImpl implements UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource
	private WtuUserMapper wtuUserMapper;

	public WtuUser getUserByName(String name) {
		WtuUserExample example = new WtuUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(name);
		try {
			List<WtuUser> users = wtuUserMapper.selectByExample(example);
			if(users != null && users.size()>0){
				return users.get(0);
			}
		} catch (Exception e) {
			logger.error("UserServiceImpl getUserByName has error", e);
		}
		return new WtuUser();
	}
	
	

}
