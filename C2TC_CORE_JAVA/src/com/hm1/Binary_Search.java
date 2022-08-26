package com.hm1;

import java.util.*;

public class Binary_Search {

	public static void main(String[] args) {
		
//		Declaring and initializing array
		
		int arr[] = {10,40,50,90,20,80,30};
		System.out.println("Array :" );
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
//		Sorting array
		
		Arrays.sort(arr);
		
		System.out.println("\nSorted array :" );
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		int a = 50;
		System.out.println("\n" + a + "found at index " + Arrays.binarySearch(arr, a));
		

	}

}
