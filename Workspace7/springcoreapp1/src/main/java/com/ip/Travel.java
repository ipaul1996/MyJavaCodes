package com.ip;

public class Travel {
	
	Vehicle v;
	
	public Travel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Travel(Vehicle v) {
		super();
		this.v = v;
	}



	public Vehicle getV() {
		return v;
	}




	public void setV(Vehicle v) {
		this.v = v;
	}




	public void journey() {
		System.out.println("Journey started...");
		v.go();
	}
	
	

}
