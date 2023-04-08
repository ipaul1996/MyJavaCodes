package com.ip.Test3;

public class A {
	
	static int x = 0;
	
	static void hello() {
		System.out.println("Hello");
	}
	
	void hey() {
		System.out.println(x);
		hello();
	}
	
	{
		System.out.println(x);
		hello();
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.hey();
	}

}
