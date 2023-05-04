package com.ip.Test7;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;



class Student {
	
	private int roll;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
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



	protected void setName(String name) {
		this.name = name;
	}



	public Student(Student s) {
		this.roll = s.getRoll();
		this.name = s.getName();
		
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}
	
	
	
}

public abstract class Demo4 {
	
	private int roll;
	private int[] arr;
	private List<Integer> list;
	private Integer a1;
	private List<Student> students;
	
	public Demo4() {
		
	}

	public Demo4(int roll, int[] arr, List<Integer> list, Integer a1, List<Student> students) {
		super();
		this.roll = roll;
		this.arr = arr;
		this.list = list;
		this.a1 = a1;
		this.students = students;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arr);
		result = prime * result + Objects.hash(a1, list, roll, students);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo4 other = (Demo4) obj;
		return Objects.equals(a1, other.a1) && Arrays.equals(arr, other.arr) && Objects.equals(list, other.list)
				&& roll == other.roll && Objects.equals(students, other.students);
	}
	
	public static void main(String[] args) {
		
		
		Student s = new Student();
		
		s.setName(null);
	}

	
	

}
