package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjection {
	
	    public static void main(String[] args) {
			
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver"); 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
			String url = "jdbc:mysql://localhost:3306/Practise"; 
			
			Connection conn = null;
		
			try {
				conn = DriverManager.getConnection(url, "root", "sql123"); 	
				Statement st = conn.createStatement(); 	
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter");
				String name = sc.nextLine();
				ResultSet rs = st.executeQuery("SELECT * FROM Student1 WHERE name= '"+name+"' ");
				//name = '' OR 1=1
				
				while(rs.next()) {
					System.out.println(rs.getInt("ID"));
				}
				
			} catch (SQLException sq) {
				System.out.println(sq.getMessage());
				
			} finally {
				
					try {		
						conn.close(); //Closing the connection
						
					} catch (SQLException e) {
						e.printStackTrace();
						
					}
				
			}
	    	
		}
	
		

}

