package com.hm1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		//Getting user input for array size
		System.out.println("Enter size of array (less than 50):");	
		
		size = sc.nextInt();
		
		//Declaring and defining array
		int[] arr = new int[50];	
		System.out.println("Enter elements for array :");
		
		//Getting array elements
		for(int i = 0; i < size; i++) {		
			arr[i] = sc.nextInt();
		}
		
		//Printing array
		System.out.println("Array = ");		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\nData type and Class :");
		System.out.println(arr.getClass().getName());		

	}

}
