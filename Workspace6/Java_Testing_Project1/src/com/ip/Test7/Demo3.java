package com.ip.Test7;

class Car {
	
	private String model;
	private int horse_power;

	public Car(String model, int horse_power) {
		this.model = model;
		this.horse_power = horse_power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorse_power() {
		return horse_power;
	}

	public void setHorse_power(int horse_power) {
		this.horse_power = horse_power;
	}
	
	

}


public class Demo3 {
	
	Car myCar1 = new Car(null, 0);

	static Car myCar;
	static {
			myCar = new Car("Maruti", 80);
	}
	
	public static void main(String[] args) {
		
		Demo3 d1 = new Demo3();
		Demo3 d2 = new Demo3();
		
		Car c1 = d1.myCar;
		Car c2 = d2.myCar;
		
		c1.setHorse_power(60);
		
		System.out.println(c2.getHorse_power());
		
		Object obj =new Object();
		
		
	}

}


