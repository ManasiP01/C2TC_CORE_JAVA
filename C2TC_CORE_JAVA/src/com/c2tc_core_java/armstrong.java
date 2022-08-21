package com.c2tc_core_java;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String[] args) {
		
		System.out.println("***** Armstrong numbers *****");
		
		System.out.println("Enter limit for armstrong number :");
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		int temp,dig,sum;
		
		for(int i = 0; i < c; i++) {
			temp = i;
			sum = 0;
			while(temp != 0) {
				dig = temp % 10;
				sum = sum + dig * dig * dig;
				temp /= 10;
			}
			
			if(sum == i)
				System.out.println(i);
		}
		
	}
}
