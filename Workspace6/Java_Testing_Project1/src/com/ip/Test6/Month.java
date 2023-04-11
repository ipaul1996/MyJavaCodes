package com.ip.Test6;

public enum Month  {

	
		
	JAN, FEB(28), MAR(31), APR, MAY;
	
	private Month() {
		System.out.println("Inside the constructor of Month");
	}
	
	
	private Month(int num) {
		System.out.println("Inside the constructor of Month(int num)");
	}
	
		
}
