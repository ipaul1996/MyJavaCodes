package com.ip.loose_coupling;

public class Car implements Vehicle{

	@Override
	public void go() {
		
		start();
		
	}
	
	void start() {
		System.out.println("Car started");
	}
 
}
