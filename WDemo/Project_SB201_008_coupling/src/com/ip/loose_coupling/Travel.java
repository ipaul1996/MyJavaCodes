package com.ip.loose_coupling;

public class Travel {
	
	Vehicle v;
	
	public Travel(Vehicle v) { //Constructor injection point
		this.v = v;
	}
	
	public Travel() {
		
	}
	

	public void setV(Vehicle v) { //Setter injection point
		this.v = v;
	}

	void journey() {
		v.go();
	}
 
}
