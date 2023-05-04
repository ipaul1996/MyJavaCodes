package com.ip.usecase;

import java.util.List;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class GetAllStudentUseCase {
	
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		List<Student> list = dao.getAllStudentDetails();
		
		list.forEach(c -> System.out.println(c));
		
		
	}

}
