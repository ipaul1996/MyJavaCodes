package com.ip;

public class Bike implements Vehicle{

	@Override
	public void go() {
		
		ride();
		
	}
	
	void ride() {
		
		System.out.println("Ride started");
		
	}

}
