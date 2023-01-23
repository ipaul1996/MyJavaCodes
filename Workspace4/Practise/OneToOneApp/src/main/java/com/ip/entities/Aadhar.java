package com.ip.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	
	public Aadhar() {
		// TODO Auto-generated constructor stub
	}

	public Aadhar(int aid, String state, Person person) {
		super();
		this.aid = aid;
		this.state = state;
		this.person = person;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Aadhar [aid=" + aid + ", state=" + state + "]";
	}

	
	
	
	
	

}
