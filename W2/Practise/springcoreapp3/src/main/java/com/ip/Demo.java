package com.ip;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		A a1 = ctx.getBean("a1", A.class);
		
		List<String> cities = (List<String>)ctx.getBean("cNames");
		
		cities.forEach(c -> System.out.println(c));
		
		
		Student student = ctx.getBean("s1", Student.class);
		
		student.funA();

		
		Test t = ctx.getBean("test", Test.class);
		t.myFunc();
	}

}
