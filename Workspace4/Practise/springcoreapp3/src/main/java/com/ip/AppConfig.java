package com.ip;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.ip"})
@PropertySource("a1.properties")
public class AppConfig {
	
	@PostConstruct
	public void mySetUp() {
		System.out.println("Inside mySetUp method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	@Bean
	public B getB() {
		B b1 = new B();
		return b1;
	}
	
	@Bean("cList")
	public List<String> getCities() {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Kolkata");
		cities.add("Delhi");
		cities.add("Bangalore");
		cities.add("Hyderabad");
		
		return cities;
	}
	
	@Bean("cNames")
	public List<String> getNames() {
		List<String> names = new ArrayList<>();
		
		names.add("Ram");
		names.add("Laxman");
		names.add("Sita");
		names.add("Hari");
		
		return names;
	}
	
	
	
	

}
