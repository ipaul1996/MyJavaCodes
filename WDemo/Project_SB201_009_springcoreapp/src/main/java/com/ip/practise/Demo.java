package com.ip.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		A a1 = ctx.getBean(A.class, "a");
//		
//		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
//		
//		ctx2.close();
	}

}
