package com.ip.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String ename;
	private int esalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String ename, int esalary) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	

}
