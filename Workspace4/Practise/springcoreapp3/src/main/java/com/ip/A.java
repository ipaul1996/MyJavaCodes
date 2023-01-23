package com.ip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("a1")
public class A {
	
	@Autowired
	B b1;
	
	public void funA() {
		System.out.println("Inside funA of A");
		System.out.println(b1);
	}

}
