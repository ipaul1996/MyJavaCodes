package com.ip.dto;

import javax.persistence.*;

public class StudentDTO {
	
	private int roll;
	
	private String name;
	
	private String email;
	
	private int cid;
	
	private String cname;
	
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public StudentDTO(int roll, String name, String email, int cid, String cname) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.cid = cid;
		this.cname = cname;
	}




	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
		

}
