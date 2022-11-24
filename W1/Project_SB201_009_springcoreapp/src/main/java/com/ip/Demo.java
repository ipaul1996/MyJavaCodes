package com.ip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		//activate the spring ioc container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pulling the spring bean object with the help of id
		Travel travel1 = ctx.getBean("tr1", Travel.class);
		
		travel1.journey();
		
//		Travel travel2 = ctx.getBean("tr2", Travel.class);
//		
//		travel2.journey();
	}

}
