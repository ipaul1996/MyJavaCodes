package com.ip.Test6;

import java.util.HashSet;
import java.util.Set;

public class Demo4 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Amit", new String[] {"Black"});
		Student s2 = new Student(1, "Amit", new String[] {"Black"});
		
//		System.out.println(s1.equals(s2)); 
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
//		Set<Student> set = new HashSet<>();
//		
//		set.add(s1);
//		set.add(s2);
//		System.out.println(set);
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
	}

}
