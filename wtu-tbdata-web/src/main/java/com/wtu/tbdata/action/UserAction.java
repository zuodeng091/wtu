package com.wtu.tbdata.action;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wtu.tbdata.facade.service.UserService;

import com.wtu.tbdata.common.log.LogAnnotation;
import com.wtu.tbdata.domain.User;
import com.wtu.tbdata.domain.WtuUser;

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
	
	@RequestMapping("getUserList")
	public String getUserList(){
		try {
			list = userService.getUserByName(name);
			userService.insert();
		} catch (Exception e) {
			logger.error("getUserList has error",e);
		}
		return "userList";
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
