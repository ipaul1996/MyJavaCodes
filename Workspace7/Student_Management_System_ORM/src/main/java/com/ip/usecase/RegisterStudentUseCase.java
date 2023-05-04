package com.ip.usecase;

import java.util.Scanner;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class RegisterStudentUseCase {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll no: ");
		int roll = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter password: ");
		String  password = sc.nextLine();
		
		Student student = new Student(roll, name, address, email, password);
		
		StudentDao dao = new StudentDaoImpl();
		 
		String message = dao.registerStudent(student);
		
		System.out.println(message);
	}

}
