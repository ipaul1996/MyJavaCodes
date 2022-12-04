package com.ip.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		com.ip.dao1.A a1 = ctx.getBean("a1", com.ip.dao1.A.class);
		
		a1.funA();
		
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
		
		ctx2.close();
	}

}
