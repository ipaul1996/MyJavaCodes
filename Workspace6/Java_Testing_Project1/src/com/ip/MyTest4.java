package com.ip;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MyTest4 {
	
	final int x = 0;   
	
	final int y;
	
	public MyTest4(int y) {  //Uninitialized final field must be initialized through constructor
		this.y = y;
	}
	
	
	
	public static void main(String[] args) {
		
	   System.out.println("Inside Main Method");	   
	   MyTest4 t = new MyTest4(0);
	   
	   
	   
	   Class c = t.getClass();
	   
	   System.out.println(Arrays.toString(c.getMethods()));
	   
	   Method[] arr = c.getMethods();
	   
	   
	   

	   
		
	}
	
}
