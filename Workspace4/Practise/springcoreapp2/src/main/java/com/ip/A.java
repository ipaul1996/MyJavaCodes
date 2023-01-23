package com.ip;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "a1")
@Scope("singleton")
public class A {
	
	@Autowired
	@Qualifier("b5")
	public B b1;

	public void funA() {
		System.out.println("Inside funA of A");
	}
	
	@PostConstruct
	public void setUp() {
		System.out.println("Inside set up method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
