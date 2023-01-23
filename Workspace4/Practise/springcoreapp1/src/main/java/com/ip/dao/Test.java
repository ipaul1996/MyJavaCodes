package com.ip.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    Demo d1 = ctx.getBean("dem", Demo.class);
	    
	    d1.showDetails();
	}
}
