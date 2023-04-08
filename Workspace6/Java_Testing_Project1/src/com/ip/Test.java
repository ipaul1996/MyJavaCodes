package com.ip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		final int x= 10;
		
		int[] arr = {1, 10, -5, 4, 7};
		
		if(arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}
		
		Arrays.sort(arr);	
		System.out.println(arr[arr.length - 2]);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		
		try {
			Connection conn = DriverManager.getConnection(null);
			
			conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
