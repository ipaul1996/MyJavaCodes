package com.ip.model;

public class B {
	
	A a1;
	
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setA1(A a1) {
		this.a1 = a1;
	}



	public B(A a1) {
		super();
		this.a1 = a1;
	}



	public void funB() {
		System.out.println("Inside funB of class B");
	}

}
