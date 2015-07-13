package com.wtu.tbdata.common.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHolder implements ApplicationContextAware,DisposableBean{

	private static ApplicationContext applicationContext = null;
	
	private static Logger logger = LoggerFactory.getLogger(SpringContextHolder.class);
	
	/**
	 * 销毁SpringContextHolder的application
	 */
	public void destroy() throws Exception {
		SpringContextHolder.clean();
	}

	/**
	 * 注入SpringContextHolder中的applicationContext
	 */
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		logger.info("注入SpringContextHolder中的applicationContext:"+applicationContext);
		if (SpringContextHolder.applicationContext != null) {
			logger.warn("SpringContextHolder中的ApplicationContext被覆盖, 原有ApplicationContext为:" + SpringContextHolder.applicationContext);
		}
		SpringContextHolder.applicationContext = arg0; // NOSONAR
	}
	
	/**
	 * 清除SpringContextHolder中的applicationContext
	 */
	public static void clean(){
		logger.info("清除SpringContextHolder中的applicationContext:"+applicationContext);
		applicationContext = null;
	}
	
	/**
	 * 取得存储在静态变量中的ApplicationContext.
	 */
	public static ApplicationContext getApplicationContext() {
		assertContextInjected();
		return applicationContext;
	}

	/**
	 * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		assertContextInjected();
		return (T) applicationContext.getBean(name);
	}

	/**
	 * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
	 */
	public static <T> T getBean(Class<T> requiredType) {
		assertContextInjected();
		return applicationContext.getBean(requiredType);
	}

	/**
	 * 检查ApplicationContext不为空.
	 */
	private static void assertContextInjected() {
		if (applicationContext == null) {
			throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder");
		}
	}

}
