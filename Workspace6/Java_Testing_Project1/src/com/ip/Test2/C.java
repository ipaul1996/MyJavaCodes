package com.ip.Test2;

public class C extends B {
	
	void funC() {
		System.out.println("Inside funC of C");
	}
	
	@Override
	void hello() {
		System.out.println("Hello from C");
	}

	
	static void hey() {
		System.out.println("Hey from C");
	}

}
