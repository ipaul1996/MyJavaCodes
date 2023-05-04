package com.ip.usecase;

import java.util.Scanner;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;

public class DeleteStudentUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student roll number: ");
		int roll = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		
		String message = dao.deleteStudent(roll);
		
		System.out.println(message);
		
	}

}
