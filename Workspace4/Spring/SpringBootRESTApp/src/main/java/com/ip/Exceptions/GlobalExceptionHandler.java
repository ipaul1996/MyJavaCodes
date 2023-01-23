package com.ip.Exceptions;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(InvalidRollException.class)
	public void myIllegalHandler(HttpServletResponse resp,InvalidRollException ie) throws IOException {
		System.out.println("inside myHandler method...");
		resp.sendError(HttpStatus.OK.value(),ie.getMessage());
	}
	

	
	@ExceptionHandler(Exception.class)
	public void myExceptionHandler(HttpServletResponse resp,Exception e) throws IOException {
		System.out.println("inside myHandler 2 method...");
		resp.sendError(HttpStatus.BAD_REQUEST.value(),e.getMessage());
	}

}
