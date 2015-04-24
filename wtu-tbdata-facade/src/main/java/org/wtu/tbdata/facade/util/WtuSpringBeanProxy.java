package org.wtu.tbdata.facade.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class WtuSpringBeanProxy implements BeanFactoryAware{
	
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		SpringBeanProxy.setBeanFactory(arg0);
	}
	
	public static Object getBean(String beanName){
		return SpringBeanProxy.getBean(beanName);
	}
	
}
