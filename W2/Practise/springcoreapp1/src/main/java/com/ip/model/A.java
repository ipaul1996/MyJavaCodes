package com.ip.model;

public class A {
	
	B b1;
	
	public A() {
		// TODO Auto-generated constructor stub
	}
	
	

	public A(B b1) {
		super();
		this.b1 = b1;
	}



	public void setB1(B b1) {
		this.b1 = b1;
	}
	
	public void funA() {
		System.out.println("Inside funA of A");
		b1.funB();
	}

}
