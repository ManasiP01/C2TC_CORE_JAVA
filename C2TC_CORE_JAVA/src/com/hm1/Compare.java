package com.hm1;

import java.util.*;

public class Compare {

	public static void main(String[] args) {
		
//		Creating array
		int arr1[] = new int[4] ;
		int arr2[] = new int[4] ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements for array1 :");
		for(int i=0; i<4; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter elements for array2 :");
		for(int i=0; i<4; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Array1 :");
		for(int i=0; i<4; i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		System.out.println("\nArray2 :");
		for(int i=0; i<4; i++) {
			System.out.print(arr2[i] + "\t");
		}
			
//		Comparing array elements
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("\nBoth arrays are same");
		}
		else {
			System.out.println("\nArrays are not same");
		}
	}

}
