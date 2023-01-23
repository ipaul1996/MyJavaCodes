package com.ip.Exeptions;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime timeStamp;
	private String msg;
	private String path;
	
	public ErrorDetails() {
		
	}

	public ErrorDetails(LocalDateTime timeStamp, String msg, String path) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.path = path;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
