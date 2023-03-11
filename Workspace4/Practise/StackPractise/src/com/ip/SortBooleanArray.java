package com.ip;

import java.util.Arrays;

public class SortBooleanArray {
	
	public static  boolean[]  sortArray(boolean[] arr) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true)  count++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i < count) {
				arr[i] = true;
			} else {
				arr[i] = false;
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {
		
		boolean[] arr = {false, false, true, true, false, false};
		arr = sortArray(arr);
		
		System.out.println(Arrays.toString(arr));  //[true, true, false, false, false, false]

	}

}
