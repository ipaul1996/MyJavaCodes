package com.ip;

public class A {
	
	
	int x = 10;
	static int y = 10;
	
	String a1 = "Hello default";
	protected String a2 = "Hello protected";
	public String a3 = "Hello public";
	private String a4 = "Hello private";
	
	static void myFunc() {
		System.out.println("Its static method");
	}
	
	void fun1() {
		System.out.println("Inside default fun1 of A");
	}
	
	protected void fun2() {
		System.out.println("Inside protected fun2 of A");
	}
	
	public void fun3() {
		System.out.println("Inside public fun3 of A");
	}
	
	private void fun4() {
		System.out.println("Inside private fun4 of A");
	}
	
	String getA4() {
		return a4;
	}

}
