package com.ip.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String dname;
	
	@OneToMany
	@JoinTable(name = "dept_emp",  joinColumns = @JoinColumn(name = "did"), inverseJoinColumns = @JoinColumn(name = "eid"))
	private List<Employee> emps = new ArrayList<>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname, List<Employee> emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", emps=" + emps + "]";
	}
	
	

	
	
	

}
