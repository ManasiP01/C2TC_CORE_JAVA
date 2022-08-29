package com.hm1;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		
//		Create array 
		int arr[] = new int[10];
		
		System.out.println("Enter size of array : " );
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter elements for array :");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
//		Get element for search
		int i ;
		System.out.println("Enter element to search from array : ");
		int a = sc.nextInt();
		for( i = 0; i < size; i++) {
			if(a == arr[i]) {
				System.out.println(a + " found at index " + i);
				break;
			}
		}
		
		if(i == size) {
			System.out.println("Element not found");
		}

	}

}
