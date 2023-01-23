package com.ip;

public class Travel {
	
	private Vehicle v;
	private int numberOfPerson;
	
	public Travel(Vehicle v, int numberOfPerson) { //Constructor injection point
		super();
		this.v = v;
		this.numberOfPerson = numberOfPerson;
	}
	
	public Travel() {
		
	}
	

	public void setV(Vehicle v) { //Setter injection point
		this.v = v;
	}
	

	public void setNumberOfPerson(int numberOfPerson) { //Setter injection point
		this.numberOfPerson = numberOfPerson;
	}

	void journey() {
		v.go();
		
		System.out.println("Journey started...");
		System.out.println("Number of person : " + numberOfPerson);
	}
 
}
