package com.ip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("s1")
public class Student {
	
	@Value("1")
	private int roll;
	
	@Value("Ram")
	private String name;
	
	@Value("78")
	private int marks;
	
	public void funA() {
		System.out.println("inside funA of A");
		System.out.println("Roll is "+roll);
		System.out.println("Name is "+name);
		System.out.println("Marks is "+marks);
		}


}
