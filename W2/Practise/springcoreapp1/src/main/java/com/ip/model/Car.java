package com.ip.model;

public class Car implements Vehicle{
	
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void go() {
		start();
		
	}

}
