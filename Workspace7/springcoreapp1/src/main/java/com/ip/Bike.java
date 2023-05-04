package com.ip;

public class Bike implements Vehicle {

	@Override
	public void go() {
		ride();
		
	}

	public void ride() {		
		System.out.println("Journey started with Bike");
	}

}
