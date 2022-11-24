package com.ip.loose_coupling;

public class Demo {
	
	public static void main(String[] args) {
		
//		Travel tr = new Travel(new Car());
		
//		Travel tr = new Travel(new Bike());
		
		Travel tr = new Travel();
		
		tr.setV(new Bike());
		
		tr.journey();
	}

}
