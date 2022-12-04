package com.ip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("DB")
public class DataBase {
	
	@Value("${db.driverName}")
	private String dName;
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.uName}")
	private String uName;
	
	@Value("${db.pass}")
	private String pass;
	
	public void funA() {
		System.out.println("Driver name is : " + dName);
		System.out.println("URL is : " + url);
		System.out.println("User name is : " + uName);
		System.out.println("Password is : " + pass);
	}

}
