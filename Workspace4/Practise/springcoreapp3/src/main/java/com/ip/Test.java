package com.ip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class Test {
	
	@Autowired
	Environment env;
	
	public void myFunc() {
		System.out.println("Driver name is " + env.getProperty("db.dName"));
		System.out.println("URL is " + env.getProperty("db.url"));
		System.out.println("User name is " + env.getProperty("db.uName"));
		System.out.println("Password is " + env.getProperty("db.pass"));
	}

}
