package com.ip.usecase;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class RegisterStudentUseCase {
	
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		Student s = new Student(3, "Kaju", "Banglaore", "b@email", "15456");
		
		String message = dao.registerStudent(s);
		
		System.out.println(message);
		
		
	}

}
