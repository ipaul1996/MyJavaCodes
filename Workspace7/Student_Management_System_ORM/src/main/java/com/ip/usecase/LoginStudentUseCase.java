package com.ip.usecase;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class LoginStudentUseCase {
	
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		Student student = dao.loginStudent("k@email", "1245781");
		
		System.out.println(student);
		
	}

}
