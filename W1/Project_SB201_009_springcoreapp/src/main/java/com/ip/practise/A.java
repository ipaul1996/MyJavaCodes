package com.ip.practise;

public class A {
	
	private int roll;
	private String name;
	
	public A(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
		
		System.out.println(this.roll);
		System.out.println(this.name);
	}
	
	public void mysetup() {
		System.out.println("Object created");
	}
	
	public void destroy() {
		System.out.println("Object destroyed");
	}
	
	

}
