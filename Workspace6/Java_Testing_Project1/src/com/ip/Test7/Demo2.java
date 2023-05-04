package com.ip.Test7;

import java.io.IOException;

public class Demo2 {
	
	public static void main(String[] args) throws IOException {
		
		Integer num3 = 28000;
		Integer num4 = 5;
		Integer sumWrapper = num3 + num4; // Addition 
		Integer differenceWrapper = num3 - num4; // Subtraction 
		Integer productWrapper = num3 * num4; // Multiplication 
		Integer quotientWrapper = num3 / num4; // Division 
		Integer moduloWrapper = num3 % num4;
		
		System.out.println(sumWrapper); //28005
		System.out.println(differenceWrapper); //27995
		System.out.println(productWrapper); //140000
		System.out.println(quotientWrapper); //5600
		System.out.println(moduloWrapper); //0
		
		System.out.println(--quotientWrapper); //5599
		System.out.println(++quotientWrapper); //5600
		
		Double num1 = 2.5;
		Double num2 = 3.0;
		Double result = num1 * num2;
		System.out.println(result); //7.5
		
		Character ch1 = 'd';
		Character ch2 = 'a';
		int res = ch1 - ch2;
		System.out.println(res); //3
		
		//It is important to note that arithmetic operations on wrapper class objects can lead 
		//to overflow or underflow, just like with primitive types.
		
		Integer n1 = Integer.MAX_VALUE; // 2147483647
		Integer n2 = 2;
		Integer r1 = n1 + n2;
		System.out.println(r1); // -2147483647
		
		Byte n3 = Byte.MIN_VALUE; // -128
		Byte n4 = 1;
		Byte r2 = (byte)(n3 - n4);
		System.out.println(r2); // Output: 127

		
		

	}

}
