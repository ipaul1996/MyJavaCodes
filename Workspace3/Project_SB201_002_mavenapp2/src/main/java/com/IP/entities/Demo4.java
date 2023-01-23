package com.IP.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Demo4 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Main.getEMF();
		EntityManager em = emf.createEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll no. of the student : ");
		int roll = sc.nextInt();
		
		Student student = em.find(Student.class, roll);
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		student.setMarks(student.getMarks() + 10);
		
		et.commit();
		
		em.close();
		
		System.out.println("Marks of the specified student is updated");
	}
}
