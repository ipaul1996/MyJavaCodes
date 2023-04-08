package com.ip;

import java.util.Scanner;

public class Demo {
	
	void fun1(A a1) {
		
		System.out.println("inside fun1(A a1) of Demo");
	}
	
	
	
	void fun1(B b1) {
		
		System.out.println("inside fun1(B b1) of Demo");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		
		System.out.println(System.in);  //java.io.BufferedInputStream@3f3afe78
		
	}

}
