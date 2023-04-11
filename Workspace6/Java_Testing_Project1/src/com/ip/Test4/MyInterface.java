package com.ip.Test4;

public interface MyInterface {
	
	public static final int x = 5;
	
	public default void myMethod() {
		System.out.println("This is a default method");
	}
	
	
    
    public static void method2() {
        System.out.println("This is a public default method.");
    }
    

}
