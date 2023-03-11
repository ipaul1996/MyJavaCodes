package com.ip;

public class Demo3 {
	
	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "abcd";
		
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		System.out.println(str1.hashCode()); //2987074
		System.out.println(str2.hashCode());  //2987074
		System.out.println(str3.hashCode());  //2987074
		System.out.println(str4.hashCode());  //2987074
		
		System.out.println(str1 == str2);  //true
		System.out.println(str3 == str4); //false
		
		System.out.println(str1 == str3);  //false
		
		String str5 = str1 + "c";
		System.out.println(str5.hashCode()); //92599393
		System.out.println(str1 == str5);	//false
		
		String str6 = str3 + "c";
		System.out.println(str6.hashCode()); //92599393
		System.out.println(str3 == str6);  //false
		
		System.out.println(str5 == str6); //false
		
		String str7 = str6.concat("abc");
		System.out.println(str7 == str7.intern()); //true
		
		String str8 = "abcdcabc";
		System.out.println(str8 == str8.intern());  //true
		
		System.out.println(str7);  
		System.out.println(str8);
		
		System.out.println(str7 == str8); //true
		
		Integer i1 = 12;
		Integer i2 = 12;
		Integer i3 = 1000;
		Integer i4 = 1000;
		
		System.out.println(i1 == i2);   //true
		System.out.println(i3 == i4);   //false
		
		
	}

}
