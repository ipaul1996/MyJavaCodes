package com.ip.First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/HelloDb1";
		
		
		Connection conn = null;
	
		
		try {
			conn = DriverManager.getConnection(url, "root", "sql123");
			Statement st = conn.createStatement();
			
			int x = st.executeUpdate("CREATE TABLE students (id INT(11) PRIMARY KEY, name VARCHAR(50) NOT NULL)");			
			System.out.println("Table has been created");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
