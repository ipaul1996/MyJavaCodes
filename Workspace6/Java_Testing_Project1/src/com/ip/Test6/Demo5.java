package com.ip.Test6;

import com.ip.functionalInterface.Intr;
import com.ip.functionalInterface.IntrImpl;

public class Demo5 {
	
	public static void main(String[] args) {
		
		Intr i1 = new IntrImpl();
		
		i1.funA();
		i1.funI();
		System.out.println(i1.X);
		//i1.funZ(); //CE
		Intr.funZ();
		System.out.println(Intr.X);
		
		
		IntrImpl i2 = new IntrImpl();
		i2.funA();
		i2.funI();
		System.out.println(i2.X);
		//i2.funZ(); //CE
		
		System.out.println(IntrImpl.X);
		System.out.println(IntrImpl.m);
		
		
	
		
		
	}

}
