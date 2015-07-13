package com.wtu.tbdata.common.log.dto;

public class InterfaceLogMessageDetail {
	
	private long startTime;
	
	private long endTime;
	
	private String result;
	
	private String params;
	
	private String methodName;
	
	public Long getID(){
		return Thread.currentThread().getId();
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public long getExecTime(){
		return this.endTime-this.startTime;
	}
	
	public void getContent(){
		
	}

}
