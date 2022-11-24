package com.ip.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ip.exceptions.CourseException;
import com.ip.exceptions.StudentException;
import com.ip.model.Student;
import com.ip.utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudent(Student student) {
		
		String message = "Unable to register student";
		
		int roll = student.getRoll();
		String name = student.getName();
		String email = student.getEmail();
		String password = student.getPassword();
		int marks = student.getMarks();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setInt(5, marks);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Record inserted successfully...";
			} 
				
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public Student loginStudent(String email, String password) throws StudentException {
		
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student where email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				String e = rs.getString("email");
				String p = rs.getString("password");
				int m = rs.getInt("marks");
				
				student = new Student(r, n, e, p, m);
			} else {
				throw new StudentException("Student not found");
			}
			
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		return student;
	}

	@Override
	public Student getStudentByRoll(int roll) throws StudentException {
		
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
				PreparedStatement ps = conn.prepareStatement("select * from student WHERE roll = ?");
				ps.setInt(1, roll);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					
					int r = rs.getInt("roll");
					String n = rs.getString("name");
					String e = rs.getString("email");
					String p = rs.getString("password");
					int m = rs.getInt("marks");
					
					student = new Student(r, n, e, p, m);
				
				} else {
					throw new StudentException("Student not found with the given roll");
				}
				
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
			
		}
		
		return student;
	}

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List<Student> students = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
				
			PreparedStatement ps = conn.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				String e = rs.getString("email");
				String p = rs.getString("password");
				int m = rs.getInt("marks");
				
				Student student = new Student(r, n, e, p, m);			
				students.add(student);
				
			}
			
		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		
		if(students.size() == 0) {
			throw new StudentException("No student found");
		}
		
		return students;
	}

	@Override
	public String registerStudentInCourse(int roll, int cid) throws StudentException, CourseException {
		
		String message = "Unable to register student into the course";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps1 = conn.prepareStatement("select * from student WHERE roll = ?");
			ps1.setInt(1, roll);
			
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1.next()) {
				
				PreparedStatement ps2 =	conn.prepareStatement("select * from course WHERE cid = ?");
				ps2.setInt(1, cid);
				
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next()) {
						
					PreparedStatement ps3 =	conn.prepareStatement("insert into course_student values(?, ?)");
					ps3.setInt(1, cid);
					ps3.setInt(2, roll);
					
					int x = ps3.executeUpdate();
					
					if(x > 0) {
						message = "Student registered into the course successfully";
					}
				} else 
					  throw new CourseException("Course not found");
				
			} else 
				 throw new StudentException("Student not found");
			
			PreparedStatement ps2 = conn.prepareStatement("select * from course WHERE roll = ?");
			ps2.setInt(1, cid);
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return message;
	}

	@Override
	public List<StudentDTO> getAllStudentByCourseName(String cname) throws CourseException {
		
		List<StudentDTO> students = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select s.roll, s.name, s.email, c.cname, c.fee "
					+ "from student s inner join course c inner join course_student cs "
					+ "ON s.roll = cs.roll AND c.cid = cs.cid AND c.cname = ?");
			ps.setString(1, cname);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				String e = rs.getString("email");
				String cn = rs.getString("cname");
				int f = rs.getInt("fee");
				
				StudentDTO sdto = new StudentDTO(r, n, e, cn, f);
				students.add(sdto);
				
			}
			
			
		} catch (SQLException e) {
			throw new CourseException(e.getMessage());
		}
		
		if(students.size() == 0) {
			throw new CourseException("Invalid course");
		}
		
		return students;
	}

}
