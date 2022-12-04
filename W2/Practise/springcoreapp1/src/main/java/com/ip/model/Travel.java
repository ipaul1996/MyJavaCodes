package com.ip.model;

public class Travel {
	
	Vehicle v;
	int numberOfPerson;
	
	public Travel() {
		// TODO Auto-generated constructor stub
	}

	

	public Travel(Vehicle v, int numberOfPerson) {
		super();
		this.v = v;
		this.numberOfPerson = numberOfPerson;
	}



	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}



	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void journey() {
		v.go();
		System.out.println("Journey started...");
		System.out.println("Number of peron is: " + numberOfPerson);
	}

}
