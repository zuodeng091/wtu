package org.wtu.tbdata.facade.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

public class SpringBeanProxy {
	
	private static BeanFactory ctx;

	public static synchronized void setApplicationContext(
			ApplicationContext arg0) {
		ctx = arg0;
	}

	public static synchronized void setBeanFactory(BeanFactory arg0) {
		ctx = arg0;
	}

	public static Object getBean(String beanName) {
		return ctx.getBean(beanName);
	}

	public static boolean containsBean(String beanName) {
		return ctx.containsBean(beanName);
	}

}
