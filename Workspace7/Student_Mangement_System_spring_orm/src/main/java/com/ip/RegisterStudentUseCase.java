package com.ip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class RegisterStudentUseCase {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentDao dao = ctx.getBean("stDao", StudentDaoImpl.class);
		
		Student student = new Student(11, "Amit", "Delhi", "a@email", "123654");
		
		String message = dao.registerStudent(student);
		
		System.out.println(message);
		
	}

}
