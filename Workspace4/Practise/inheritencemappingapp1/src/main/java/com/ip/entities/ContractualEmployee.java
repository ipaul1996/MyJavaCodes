package com.ip.entities;

import javax.persistence.Entity;


@Entity
public class ContractualEmployee extends Employee {
	
	private int noOfWorkingDay;
	private int costPerDay;
	
	public ContractualEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractualEmployee(int noOfWorkingDay, int costPerDay) {
		super();
		this.noOfWorkingDay = noOfWorkingDay;
		this.costPerDay = costPerDay;
	}

	public int getNoOfWorkingDay() {
		return noOfWorkingDay;
	}

	public void setNoOfWorkingDay(int noOfWorkingDay) {
		this.noOfWorkingDay = noOfWorkingDay;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [noOfWorkingDay=" + noOfWorkingDay + ", costPerDay=" + costPerDay + "]";
	}
	
	

}
