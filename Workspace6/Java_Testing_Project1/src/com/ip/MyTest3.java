package com.ip;

public class MyTest3 {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		//First Block of code execution then condition check
		//It is for sure the block will be executed at least for once
		do {
			System.out.println(i);
			i--;
		}
		while(i < 5);  //Terminator mandatory
		//10 gets printed once
		
		//********************************************************
		
		//First condition check then block of code execution
		//There is no surety that the block of code will be executed at least once
		while(i < 5) {
			System.out.println(i);
			i--;
		}
		//Nothing gets printed
		
		
	}

}
