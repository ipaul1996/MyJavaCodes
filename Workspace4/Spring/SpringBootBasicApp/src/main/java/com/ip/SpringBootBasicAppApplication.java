package com.ip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicAppApplication {

	public static void main(String[] args) {
	 
		ApplicationContext ctx = SpringApplication.run(SpringBootBasicAppApplication.class, args);
	
		A a1 = ctx.getBean("a", A.class);
		
		a1.funA();
	}

}
