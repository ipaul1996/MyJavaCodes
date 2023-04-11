package com.ip.Test6;

public class Demo2 {
	
	public static int addV1(int i, int j) {
		return i + j;
	}
	
	public static int addV2(int[] arr) {
		
		int sum = 0;
		
		if(arr == null) {
			return sum;
		}
		
		for(int i : arr) {
			sum += i;
		}
		
		return sum;
	}
	
	public static int addV3(int... arr) { //arr represents an array of integers
		
		int sum = 0;
		
		
		if(arr == null) {
			
			return sum;
		}
		
		for(int i : arr) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void fun(String str, int... x) {
		System.out.println("Hello world!");
	}
	
	public static void main(String[] args) {
		
		System.out.println(addV1(1, 2)); //3 //here we can pass two arguments only, not less, not more
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
		int[] arr3 = {};
		System.out.println(addV2(arr1)); //6
		System.out.println(addV2(arr2)); //10
		System.out.println(addV2(arr3)); //0
		System.out.println(addV2(new int[] {1, 2, 3, 4 ,5})); //15
		//System.out.println(addV2({1, 2, 3, 4})); //CE --> while declaring an array we need to explicitly declare its type
		System.out.println(addV2(null)); //0
		//System.out.println(addV2()); //CE
		//System.out.println(addV2(1, 2, 3, 4)); //CE
		
		
		System.out.println(addV3()); //0
		System.out.println(addV3(1, 2, 3, 4)); //10
		System.out.println(addV3(1, 2, 3, 4, 5)); //15
		System.out.println(addV3(arr1)); //6
		System.out.println(addV3(arr2)); //10
		System.out.println(addV3(arr3)); //0
		System.out.println(addV3(new int[] {1, 2, 3, 4 ,5})); //15
		//System.out.println(addV3({1, 2, 3, 4})); //CE
		System.out.println(addV3(null)); //0
		
		fun("Hello");
		fun("Hello", 1, 2, 3);
		fun("Hello", 1);
		fun("Hello", null);
		fun(null, null);
	}

}
