package com.ip.usecase;

import com.ip.dao.StudentDao;
import com.ip.dao.StudentDaoImpl;

public class UpdateNameUseCase {
	
	public static void main(String[] args) {
		
		
		StudentDao dao = new StudentDaoImpl();
		
		String message = dao.updateName(2, "Bijoy");
		
		System.out.println(message);
		
	}

}
