package com.masai.Model;

public class StudentDTO {

	private String name;
	private String addresss;

	public StudentDTO() {
		
	}

	public StudentDTO(String name, String addresss) {
		this.name = name;
		this.addresss = addresss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

}
