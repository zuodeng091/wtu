package com.wtu.tbdata.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.wtu.tbdata.common.util.log.ClassType;
import com.wtu.tbdata.common.util.log.LogAnnotation;
import com.wtu.tbdata.core.UserService;
import com.wtu.tbdata.domain.User;

@Controller("userAction")
@LogAnnotation(type=ClassType.CONTROLLER)
public class UserAction extends ActionSupport{
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 9171713825196099348L;
	
	/** The user service. */
	@Resource(name="userService")
	private UserService userService;

	private List<User> list;
	
	private User user;
	
	public String getUserList(){
		try {
			list = userService.getUserList();
			userService.insert();
		} catch (Exception e) {
			e.printStackTrace();
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
