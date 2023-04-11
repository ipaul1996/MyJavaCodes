package com.ip.Test6;

public interface Intr1 {

	default void myMethod() {
		System.out.println("My method from Intr1");
		myMethod1();
	}
	
	static void myMethod1() {
		System.out.println("My static method from Intr1");
		int[] arr = new int[] {1, 2, 3, 4};
	}
}
