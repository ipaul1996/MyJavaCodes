package com.ip.Exceptions;

public class InvalidRollException extends RuntimeException{
	
	public InvalidRollException() {
		
	}
	
	public InvalidRollException(String msg) {
		super(msg);
	}

}
