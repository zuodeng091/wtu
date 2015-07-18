package com.wtu.tbdata.action;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wtu.tbdata.facade.service.UserService;

import com.wtu.tbdata.common.log.LogAnnotation;
import com.wtu.tbdata.domain.WtuUser;

/**
 *
 * 用户管理action
 * @author zuodeng 作者
 */
@Controller
@LogAnnotation
@RequestMapping("user")
public class UserAction {
	
	private static final Logger logger = LoggerFactory.getLogger(UserAction.class);
	
	/** The user service. */
	@SuppressWarnings("restriction")
	@Resource(name="userService")
	private UserService userService;

	private List<WtuUser> list;
	
	private WtuUser user;

	public List<WtuUser> getList() {
		return list;
	}

	public void setList(List<WtuUser> list) {
		this.list = list;
	}

	public WtuUser getUser() {
		return user;
	}

	public void setUser(WtuUser user) {
		this.user = user;
	}
	
}
