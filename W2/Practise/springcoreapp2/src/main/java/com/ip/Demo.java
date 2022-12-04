package com.ip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new  AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
//		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
