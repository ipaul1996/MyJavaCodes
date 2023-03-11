package com.ip;

public class Test2 {
	
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		mc.setMyStaticMember(5);
		
		System.out.println(MyClass.myStaticMember);
	}

}
