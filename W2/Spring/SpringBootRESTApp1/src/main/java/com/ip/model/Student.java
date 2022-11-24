package com.ip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	
	@NotNull(message = "Name is required")
	@NotEmpty(message = "Name can not be empty")
	private String name;
	
	@NotNull(message = "Address is required")
	@NotEmpty(message = "Address can not be empty")
	private String address;
	
	@NotNull(message = "Marks is required")
	@Max(value = 500, message = "Marks shoud be between 0 and 500")
	private int marks;
	
	public Student() {
		
	}

	public Student(Integer roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
