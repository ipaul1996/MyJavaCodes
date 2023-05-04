package com.ip.usecase;

import java.util.Scanner;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class GetStudentByRollUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll number: ");
		int roll = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		
		Student student = dao.getstudentByRoll(roll);
		
		System.out.println(student);
		
		
	}

}
