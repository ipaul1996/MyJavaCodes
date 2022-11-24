package com.ip.model;

import javax.persistence.Column;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int empId;
	
	private String name;
	private int salary;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state", column = @Column(name="HOME_STATE")),
		@AttributeOverride(name="city", column = @Column(name="HOME_CITY")),
		@AttributeOverride(name="pincode", column = @Column(name="HOME_PINCODE"))
		
	})
	private Address addr;
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
		@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
		
	})
	private Address officeAddr;
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Address getOfficeAddr() {
		return officeAddr;
	}

	public void setOfficeAddr(Address officeAddr) {
		this.officeAddr = officeAddr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", addr=" + addr + ", officeAddr="
				+ officeAddr + "]";
	}

	

	
	
	
	

}
