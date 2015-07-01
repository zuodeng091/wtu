package com.wtu.tbdata.common.util.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class LogInterceptor extends AbstractLogInterceptor{

	@Pointcut("@within(com.wtu.tbdata.common.util.log.LogAnnotation) || @annotation(com.wtu.tbdata.common.util.log.LogAnnotation)")
	private void cutMethod(){
		
	}
	
	@Before(value = "cutMehtod()")
	public void doBefore() throws NoSuchMethodException,ClassNotFoundException{
		System.out.println("cutPoint");
	}
	
	@AfterReturning(pointcut="cutMethod()",returning="result")
	public void doAfter(JoinPoint joinPoint,Object result) throws NoSuchMethodException,ClassNotFoundException{
		
		System.out.println(result.toString());
		
	}
	

}
