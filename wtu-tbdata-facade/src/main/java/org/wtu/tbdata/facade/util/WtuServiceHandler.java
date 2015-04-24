package org.wtu.tbdata.facade.util;

import org.wtu.tbdata.facade.DubboService;

public class WtuServiceHandler {
	
	private static DubboService dubboService;
	
	static {
		dubboService = (DubboService) WtuSpringBeanProxy.getBean("dubboService");
	}

	public static DubboService getDubboService() {
		return dubboService;
	}

}
