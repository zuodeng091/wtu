package com.wtu.tbdata.core.impl;

import org.wtu.tbdata.facade.DubboService;

public class DubboServiceImpl2 implements DubboService{

	public String getUserName(String userName) {
		return "------------"+userName+"-----------";
	}

}
