package com.ip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;
import com.ip.entities.Student;

public class RegisterStudentUseCase {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentDao dao = ctx.getBean(StudentDaoImpl.class, "stDao");
		
		Student s = new Student(1, "Amit", "Kol", "a@email", "1245");
		
		String message = dao.registerStudent(s);
		
		System.out.println(message);
		
	}

}
