package com.ip;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Student {
	
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		
	}

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

public class Demo9 {
	
	public static void main(String[] args) {
		
		//Inside the Q the elements will not be as sorted as inside the TreeSet, but by using its peek() and poll() method, 
		//remove() method it will work according to the Comparable or Comparator(Sorting order).
		Queue<Integer> q = new PriorityQueue<>();
		
		q.offer(25);
		q.offer(5);
		q.offer(30);
		q.offer(10);				
		q.offer(45);
		q.offer(2);
		q.offer(10);
		//q.offer(null);  //NullPointerException
		
		System.out.println(q);  //[2, 10, 5, 25, 45, 30, 10]
		
		Iterator<Integer> itr = q.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		2
//		10
//		5
//		25
//		45
//		30
//		10
//		Here elements are not removed are as per the sorting order defined inside the comparator
		
		while(q.peek() != null) {
			System.out.println(q.poll());
		}
		
//		2
//		5
//		10
//		10
//		25
//		30
//		45
//		Here elements are removed are as per the sorting order defined inside the comparator
		
		Queue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		
		q1.offer(25);
		q1.offer(5);
		q1.offer(30);
		q1.offer(10);				
		q1.offer(45);
		
		System.out.println(q1);  //[45, 30, 25, 5, 10]
		
		Iterator<Integer> itr1 = q1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
//		45
//		30
//		25
//		5
//		10
//		Here elements are not removed are as per the sorting order defined inside the comparator
		
//		System.out.println(q1.poll());
		while(q1.peek() != null) {
			System.out.println(q1.poll());
		}
		
//		45
//		30
//		25
//		10
//		5
//		Here elements are removed are as per the sorting order defined inside the comparator
		
//		In ascending order of marks
		Queue<Student> q2 = new PriorityQueue<>((s1, s2) -> s1.getMarks() > s2.getMarks() ? +1 : s1.getMarks() < s2.getMarks() ? -1 : 0);
		
		q2.offer(new Student(10, "N1", 500));
		q2.add(new Student(20, "N2", 400));
		q2.add(new Student(30, "N3", 440));
		q2.add(new Student(40, "N4", 450));
		q2.add(new Student(50, "N5", 380));
		q2.add(new Student(60, "N6", 550));
		
		while(q2.peek() != null) {
			System.out.println(q2.poll());
		}
		
//		Student [roll=50, name=N5, marks=380]
//		Student [roll=20, name=N2, marks=400]
//		Student [roll=30, name=N3, marks=440]
//		Student [roll=40, name=N4, marks=450]
//		Student [roll=10, name=N1, marks=500]
//		Student [roll=60, name=N6, marks=550]
		
		
//		Descending order of roll
		Queue<Student> q3 = new PriorityQueue<>((s1, s2) -> s1.getRoll() < s2.getRoll() ? +1 : s1.getRoll() > s2.getRoll() ? -1 : 0);
		
		q3.offer(new Student(10, "N1", 500));
		q3.add(new Student(20, "N2", 400));
		q3.add(new Student(30, "N3", 440));
		q3.add(new Student(40, "N4", 450));
		q3.add(new Student(50, "N5", 380));
		q3.add(new Student(60, "N6", 550));
		
		while(q3.peek() != null) {
			System.out.println(q3.poll());
		}
		
//		Student [roll=60, name=N6, marks=550]
//		Student [roll=50, name=N5, marks=380]
//		Student [roll=40, name=N4, marks=450]
//		Student [roll=30, name=N3, marks=440]
//		Student [roll=20, name=N2, marks=400]
//		Student [roll=10, name=N1, marks=500]
		
		
		
	}

}
