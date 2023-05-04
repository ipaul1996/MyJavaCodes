package com.ip.functionalInterface;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Intr i1 = new IntrImpl();
		
		i1.funA();
		i1.funI();
		
		Intr i2 = new Intr() {
			
			@Override
			public void funA() {
				
				System.out.println("Inside funA()");
				
			}
		};
		
		i2.funA();
		
		
		
		
		Intr i3 = () -> System.out.println("Hello");
		
		i3.funA();
		
		i3.funI();
		
		
		
	
		
		
	}

}
