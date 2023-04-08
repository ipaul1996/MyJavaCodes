package com.ip;

public class B extends A {
	
	int x = 15;
	static int y = 15;
	
	static void myFunc() {
		System.out.println("Its static method in child");
	}
	
	public static void main(String[] args) {
		
//		B b1 = new B();
//		
//		System.out.println(b1.a1);
//		System.out.println(b1.a2);
//		System.out.println(b1.a3);
//		//System.out.println(b1.a4);//CE ---> private variable is not accessible outside the class
//		
//		b1.fun1();
//		b1.fun2();
//		b1.fun3();
//		//b1.fun4(); //CE ---> private method is not accessible outside the class
//		
//		b1.getA4();
//		
//		b1.myFunc();
		
		B b1 = new B();		
		System.out.println(b1.x); //15
		System.out.println(b1.y); //15
		
		
		A a1 = new A();	
		System.out.println(a1.x); //10
		System.out.println(a1.y); //10
		
		System.out.println(A.y); //10
		System.out.println(B.y); //15
	}

}

//Output
//Hello default
//Hello protected
//Hello public
//Inside default fun1 of A
//Inside protected fun2 of A
//Inside public fun3 of A
