package com.wtu.tbdata.common.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Aspect
@Component
public class LogInterceptor extends AbstractLogInterceptor{

	@Pointcut("@within(com.wtu.tbdata.common.log.LogAnnotation) || @annotation(com.wtu.tbdata.common.log.LogAnnotation)")
	private void cutMethod(){
		
	}
	
	@Before(value = "cutMethod()")
	public void doBefore() throws NoSuchMethodException,ClassNotFoundException{
		System.out.println("cutPoint");
	}
	
	@AfterReturning(pointcut="cutMethod()",returning="result")
	public void doAfter(JoinPoint joinPoint,Object result) throws NoSuchMethodException,ClassNotFoundException{
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(result));
		
	}
	

}
