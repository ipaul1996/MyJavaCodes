package com.ip;

public class Test1 {
	

	public static void main(String[] args) {
		
		System.out.println(Character.compare('a', 'b'));  //-1
		System.out.println(Character.compare('a', 'a'));  //0
		System.out.println(Character.compare('b', 'a'));  //+1
		
		System.out.println(Integer.compare(0, 0));   //0
		System.out.println(Integer.compare(1, 2));	 //-1
		System.out.println(Integer.compare(2, 1));	 //+1
		
		
		Integer i = 5;
		
		i.compareTo(6);
		i.compareTo(5);
		i.compareTo(3);
		
		
		
	}

}
