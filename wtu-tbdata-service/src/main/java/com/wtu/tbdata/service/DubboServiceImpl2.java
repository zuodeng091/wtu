package com.wtu.tbdata.service;

import org.wtu.tbdata.facade.DubboService;

public class DubboServiceImpl2 implements DubboService{

	public String getUserName(String userName) {
		return "------------"+userName+"-----------";
	}

}
