package com.ip;

public class Car implements Vehicle {

	@Override
	public void go() {
		start();
		
	}
	
	
	public void start() {
		System.out.println("Journey started with car");
	}

}
