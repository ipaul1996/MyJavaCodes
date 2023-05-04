package com.ip.usecase;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class GetStudentUseCase {
	
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		Student st = dao.getStudent(5);
		
		System.out.println(st);
		
		
	}

}
