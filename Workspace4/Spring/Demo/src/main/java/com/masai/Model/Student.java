package com.masai.Model;

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

	@NotNull(message = "Name is required.")
	@NotEmpty(message = "Name cannot be Empty.")
	private String name;

	@NotNull(message = "Address is required.")
	@NotEmpty(message = "Address cannot be null.")
	private String address;

	@NotNull(message = "marks are required")
	@Max(value = 500, message = "marks should be between 0 to 500.")
	private Integer marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer roll, String name, String address, Integer marks) {
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

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}

