package com.ip.Test3;

public interface MyInterfce {
	
	public int x = 0;
	int y = 0;
	
	static void hello() {
		System.out.println(x);
	}
	
	public default void myMethod() {
		System.out.println("This is a default method");
	}

}

class MyClass implements MyInterfce {
	
	C func1() {
		myMethod();
		System.out.println(x);
		return null;
	}
	
	MyInterfce func2() {
		System.out.println(x);
		MyClass mc = new MyClass();
		mc.func2();
		return null;
	}
	
	public static void main(String[] args) {
		
	
		
		MyClass mc = new MyClass();
		
		Object c1 = mc.func1();
		Object c2 = mc.func2();
		
		mc.myMethod();
	}
}
