package com.ip.Test4;

public interface MyInterface1 {
	
    default void myMethod() {
		System.out.println("This is a default method1");
	}

}
