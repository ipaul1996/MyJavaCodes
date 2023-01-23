package com.ip.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Aadhar addr;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname, Aadhar addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.addr = addr;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Aadhar getAddr() {
		return addr;
	}

	public void setAddr(Aadhar addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addr=" + addr + "]";
	}
	
	
	

}
