package com.ip;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Demo1 {

	public static void main(String[] args) {
		
		boolean[] arr = {true, false, false, true};
		Boolean[] arr5 = {true, false, false, true};
		
//		System.out.printf("%-10s xy", "a");
//		System.out.printf("%10.5f", 12345.23);
//		System.out.printf("%-10s", "Hello"); 
		
		String str = String.format("%+10s", "Hello"); 
		System.out.println(str); 



		
		
//		Arrays.sort(arr, (e1, e2) -> e1 == true  &&  e2 == false ? +1 : e1 == false  &&  e2 == true ? -1 : 0);
		
//		int[] arr1 = {1, 2, 3, 4, 5};
		
//		Arrays.sort(arr1, (e1, e2) -> e1 > e2 ? -1 : e1 < e2 ? +1 : 0);
		
//		Arrays.sort(arr1);
		//It works on all primitive arrays except boolean
       //int[], long[], short[], byte[], float[], double[], char[]
		//sorts in ascending order
		//Here the sorting algorithm is "Dual-Pivot Quicksort"
		//Time Complexity - O(n log(n))
//		String[] arr2 = {"amiy", "Babli", "Kamal"};
		
//		Arrays.sort(arr2);
		
//		Arrays.sort(arr5);
		
//		System.out.println(Arrays.toString(arr5));
		
//		int[] a= {1, 2, 3, 3, 4 , 4, 0, 8, 5, 2};
//		insertionSort(10 , a);
		
	}
	
	
public static void insertionSort(int n , int[] arr) {
		
		for(int i = 1; i < n; i++) {

			int temp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {
				if(arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
//					 arr[j + 1] = temp;   //[1, 1, 2, 2, 3, 3, 4, 4, 5, 8]
					break;
				}

			}

			arr[j + 1] = temp; //[0, 1, 2, 2, 3, 3, 4, 4, 5, 8]

		}

		 System.out.println(Arrays.toString(arr));
	}
}

//{1, 2, 3, 3, 4 , 4, 0, 8, 5, 2};
//[1, 1, 2, 2, 3, 3, 4, 4, 5, 8]
//[0, 1, 2, 2, 3, 3, 4, 4, 5, 8]
