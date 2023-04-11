package com.ip.Test4;

public class Demo implements MyInterface, MyInterface1 {

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
//		MyInterface.super.myMethod();
		
		System.out.println("Hello");
		MyInterface.method2();
	}
	
//	public static void main(String[] args) {
//		
//		Demo d1 = new Demo();
//		d1.myMethod();
//		
//		MyInterface.method2();
//		
//	}
//	
//	{
//		MyInterface.method2();
//	}
	
	

}
