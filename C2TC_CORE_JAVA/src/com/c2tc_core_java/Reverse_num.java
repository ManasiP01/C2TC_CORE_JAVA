package com.c2tc_core_java;

import java.util.Scanner;

public class Reverse_num {
	
	public static void main(String[] args) {
		
        System.out.println("***** Reverse number *****");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to reverse : ");
		
		int a = sc.nextInt();
		
		int b = 0;
		
		while(a != 0) {
			int temp = a % 10;
			b = b * 10 + temp;
			a /= 10;
		}
		System.out.println("Reverse number : \n"+ b);
	}

}
