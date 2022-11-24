package com.ip.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

		public static void main(String[] args) {
		
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-unit");
				EntityManager em = emf.createEntityManager();
				
//				Find
//				Student student = em.find(Student.class, 1);
//				
//				if(student != null) {
//					System.out.println(student);
//				} else {
//					System.out.println("Student not found");
//				}
//				
//				em.close();
				
				
//				Save
//				Student student = new Student(5, "Atul", 79);
//				
//				em.getTransaction().begin();
//				
//				em.persist(student);
//				
//				em.getTransaction().commit();
//				
//				em.close();
//				
//				System.out.println("Student saved..");
				
//				Delete
//				Scanner sc = new Scanner(System.in);
//				
//				System.out.println("Enter student roll : ");
//				int roll = sc.nextInt();
//				
//				Student student = em.find(Student.class, roll);
//				
//				if(student != null) {
//					
//					em.getTransaction().begin();				
//					em.remove(student);
//					em.getTransaction().commit();
//					
//					em.close();
//					
//					System.out.println("Student has been deleted...");
//					
//				} else {
//					System.out.println("Student is not found with the given roll");
//				}
				
				
//				Update Marks
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter student roll : ");
				int roll = sc.nextInt();
				
				System.out.println("Enter marks : ");
				int marks = sc.nextInt();
				
				Student student = em.find(Student.class, roll);
				
				if(student != null) {
					
					em.getTransaction().begin();				
					student.setMarks(marks);
					em.getTransaction().commit();
					
					em.close();
					
					System.out.println("Marks updated successfully");
									
				} else {
					System.out.println("Student not found...");
				}
				
				
				
				
				
				
		}
}
