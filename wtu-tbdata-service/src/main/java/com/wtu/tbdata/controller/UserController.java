package com.wtu.tbdata.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wtu.tbdata.facade.service.UserService;

import com.wtu.tbdata.domain.WtuUser;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("getUserByName")
	public void getUserByName(String name){
		
		WtuUser user = userService.getUserByName(name);
		System.out.println(user.getPassword());
		
	}

}
