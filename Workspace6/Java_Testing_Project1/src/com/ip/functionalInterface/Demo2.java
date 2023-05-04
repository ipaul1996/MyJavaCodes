package com.ip.functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Student {
	int roll;
	String name;
	int marks;
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
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



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	
	
}

@FunctionalInterface
interface MyInterface {
	
	Student createStudentObject(int roll, String name, int marks);
}

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		MyInterface intr = (r, n, m) -> new Student(r, n, m);
		
		System.out.println(intr.createStudentObject(1, "Ram", 90));
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 500));
		students.add(new Student(12, "N2", 400));
		students.add(new Student(13, "N3", 520));
		students.add(new Student(14, "N4", 450));
		students.add(new Student(15, "N5", 410));
		
		
		Collections.sort(students, (s1, s2) 
				-> Integer.compare(s1.getMarks(), s2.getMarks()));
		
		System.out.println(students);
		
		
//		Predicate<Student> p = new Predicate<>() {
//			@Override
//			public boolean test(Student t) {	
//				return t.getMarks() >= 34 ? true : false;
//
//			}
//		};
		
		Predicate<Student> p = s -> s.getMarks() > 434 ? true : false;
   		
		System.out.println(p.test(new Student(1, "Avay", 505)));
		
		students.removeIf(p);
		
		System.out.println(students);
		
		
		
		
		
		
		
		
//		
//		List<String> list = Arrays.asList("Amit", "Ajay", "Babli", "Sucharita");
//		
//		Collections.sort(list);
//		
//		Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
//		
//		Collections.sort(list, Collections.reverseOrder());
//		
//	
//		
//		System.out.println(list);
		
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		
		List<Integer> list1 = new ArrayList<>(list);
		

		list1.replaceAll(e -> e*2);
		
		System.out.println(list1);
		
		
		
		
		
		
		
 		
	}

}
