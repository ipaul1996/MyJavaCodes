package com.IP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sb201db";
		
		try {
			conn = DriverManager.getConnection(url, "root", "sql123");
			System.out.println(conn);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
