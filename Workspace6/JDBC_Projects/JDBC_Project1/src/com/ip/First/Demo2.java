package com.ip.First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/HelloDb1";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) {
			
			Statement st = conn.createStatement();
			int x = st.executeUpdate("INSERT INTO students VALUES(2, 'Mona'), (3, 'Rahul'), (4, 'Kamal')");
			if(x > 0) {
				System.out.println(x + " rows affected");
			} else {
				System.out.println("No record updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
