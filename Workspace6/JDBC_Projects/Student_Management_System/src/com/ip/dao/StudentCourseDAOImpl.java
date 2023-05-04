package com.ip.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ip.dto.StudentDTO;
import com.ip.exception.CourseException;
import com.ip.exception.StudentException;
import com.ip.model.Course;
import com.ip.model.Student;
import com.ip.utility.DBUtil;

public class StudentCourseDAOImpl implements StudentCourseDAO {

	@Override
	public String registerStudent(Student student) throws StudentException {
		
		String message = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Student VALUES(?, ?, ?, ?, ?)");
			
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setString(4, student.getEmail());
			ps.setString(4, student.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				message = "Student details inserted successfully...";
			else 
				throw new StudentException("Unable to insert student details");
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
			
		}
		
		
		return message;
	}

	
	
	@Override
	public Student getStudentByRoll(int roll) throws StudentException {
		
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Student WHERE roll = ?");
			
			ps.setInt(1, roll);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				roll = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString("password");
				
				student = new Student(roll, name, address, email, password);
				
			}
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		
		if(student == null) {
			throw new StudentException("Invalid roll number");
		}
		
		return student;
	}



	
	
	@Override
	public Student loginStudent(String email, String password) throws StudentException {
		
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Student WHERE email = ? AND password = ?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int roll = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				email = rs.getString(4);
				password = rs.getString(5);
				
				student = new Student(roll, name, address, email, password);
				
			}
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		if(student == null) {
			throw new StudentException("Invalid credentials...");
		}
		
		
		return student;
	}




	
	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List<Student> students = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Student");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int roll = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				
				Student student = new Student(roll, name, address, email, password);
				students.add(student);
			}
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		if(students.isEmpty()) {
			throw new StudentException("No student found...");
		}
		
		return students;
	}



	
	
	@Override
	public String createCourse(Course course) throws CourseException {
		
		String message = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Course(cname, fee) VALUES(?, ?, ?)");
			
			ps.setString(1, course.getCourseName());
			ps.setDouble(2, course.getFee());
			
			int x = ps.executeUpdate();
			
			if(x > 0) 
				message = "Course added successfully...";
			else
				throw new CourseException("Unable to add the course");
			
		} catch (SQLException e) {
			throw new CourseException(e.getMessage());
		}
		
		
		return message;
	}

	
	@Override
	public String registerStudentInsideCourse(int roll, int cid) throws StudentException, CourseException {
		
		String message = null;
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM Student WHERE roll = ?");
			
			ps1.setInt(1, roll);
			
			ResultSet rs = ps1.executeQuery();
			
			if(rs.next()) {
				
				PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM Course WHERE cid = ?");
				
				ps2.setInt(1, cid);
				
				ResultSet rs1 = ps1.executeQuery();
				
				if(rs1.next()) {
					
					PreparedStatement ps3 = conn.prepareStatement("INSERT INTO course_student VALUES(?, ?)");
					
					ps3.setInt(1, cid);
					ps3.setInt(2, roll);
					
					int x = ps3.executeUpdate();
					
					if(x > 0) {
						message = "Student has been enrolled into the course successfully...";
					} else {
						throw new StudentException("Unable to enroll the student into the course");
					}
					
					
				} else {
					
					throw new CourseException("Invalid course id");
				}
				
			} else {
				throw new StudentException("Invalid roll number");
			}
			
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		
		return message;
		
	}



	
	
	@Override
	public List<StudentDTO> getStudentsByCourseName() throws StudentException, CourseException {
		
		
		
		
		return null;
	}
	

	
	

}
