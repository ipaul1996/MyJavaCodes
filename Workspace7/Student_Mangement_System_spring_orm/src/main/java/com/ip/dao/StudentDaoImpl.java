package com.ip.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ip.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hTemplate;
	  
    public void sethTemplate(HibernateTemplate hTemplate) {
        this.hTemplate = hTemplate;
    }



	@Override
	@Transactional
	public String registerStudent(Student student) {
		
		String message = null;
		
		hTemplate.save(student);
		
		message = "Student has been registerd successfully...";
		
		return message;
	}


	
	@Override
	public Student getstudentByRoll(int roll) {
		
		return hTemplate.get(Student.class, roll);

	}



	@Override
	@Transactional
	public String deleteStudent(int roll) {
		
		String msg = null;
		Student s = hTemplate.get(Student.class, roll);
		hTemplate.delete(s);
		
		msg = "Student has been deleted successfully...";
		
		return msg;
	}



	@Override
	public String updateName(int roll, String name) {
		
		String msg = null;
		Student s = hTemplate.get(Student.class, roll);
		
		s.setName(name);
		
		hTemplate.update(s);
		
		msg = "Student details has been updated successfully...";
		
		return msg;
	}



	@Override
	public Student loginStudent(String email, String password) {
		
		List<Student> students = hTemplate.execute(new HibernateCallback<List<Student>>() {
	        @Override
	        public List<Student> doInHibernate(Session session) throws HibernateException {
	            Query<Student> query = session.createQuery("SELECT s FROM Student s WHERE s.email = :email AND s.password = :password", Student.class);
	            query.setParameter("email", email);
	            query.setParameter("password", password);
	            return query.getResultList();
	        }
	    });
	    if (students != null && !students.isEmpty()) {
	        return students.get(0); // Return the first student that matches the criteria
	    }
	    return null; // No student found with the given email and password
		
		
		
	}



	@Override
	public List<Student> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
