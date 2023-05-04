package com.ip.model;

public class Course {
	
	private int courseId;
	
	private String courseName;
	
	private double fee;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(int courseId, String courseName, double fee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
	
	

}