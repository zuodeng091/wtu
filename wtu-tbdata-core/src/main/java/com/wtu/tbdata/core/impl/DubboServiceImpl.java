package com.wtu.tbdata.core.impl;

import org.wtu.tbdata.facade.DubboService;


public class DubboServiceImpl implements DubboService {

	public String getUserName(String userName) {
		/*try {
			wait(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("测试接口超时");
		return userName+"dubbo";
	}

}
