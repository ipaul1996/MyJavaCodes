package com.ip.Test1;

import com.ip.A;
//If we want to use a class from a different package we have to import that

public class C extends A {
	
	public static void main(String[] args) {
		
		C c1 = new C();
		
		//System.out.println(c1.a1); //CE ---> private variable is not accessible outside class
		System.out.println(c1.a2);
		System.out.println(c1.a3);
		//System.out.println(c1.a4); //CE ---> default variable is not accessible outside the package
		
		
		//c1.fun1();  //CE  ---> private method is not accessible outside class
		c1.fun2();
		c1.fun3();
		//c1.fun4();  //CE  ---> default method is not accessible outside the package
		
		
		
	}

}
