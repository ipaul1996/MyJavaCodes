package com.ip.dao1;

public class A {
	
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void mySetUp() {
		System.out.println("Inside mySetUp method to write initialization logic");
		System.out.println("Message is : " + message);
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	public void funA() {
		System.out.println("Inside funA");
	}

}
