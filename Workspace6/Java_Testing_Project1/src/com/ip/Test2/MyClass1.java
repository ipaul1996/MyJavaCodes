package com.ip.Test2;

import java.lang.String;

public class MyClass1 extends MyClass {
	
	static int y = 0;
	
	static void hey() {
		System.out.println("Hey");
	}
	
	void myHello() {
		hello();
		System.out.println(x);
		System.out.println(y);
		hey();
	}
	
	{
		System.out.println(y);
		hello();
		hey();
	}
	
	public static void main(String[] args) {
		
		MyClass1 mc = new MyClass1();
		
		mc.myHello();
	}
	
	
}
