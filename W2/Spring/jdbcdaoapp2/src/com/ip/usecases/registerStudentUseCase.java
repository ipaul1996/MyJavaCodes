package com.ip.usecases;

import java.util.Scanner;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.exceptions.StudentException;
import com.ip.model.Student;

public class registerStudentUseCase {
	
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter student roll : ");
				int roll = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter student name : ");
				String name = sc.nextLine();
				
				System.out.println("Enter email address : ");
				String address = sc.nextLine();
				
				System.out.println("Enter password : ");
				String password = sc.nextLine();
				
				System.out.println("Enter marks : ");
				int marks = sc.nextInt();
				
				Student student = new Student(roll, name, address, password, marks);
				
				StudentDao dao = new StudentDaoImpl();
				
				dao.registerStudent(student);
						
		}

}
