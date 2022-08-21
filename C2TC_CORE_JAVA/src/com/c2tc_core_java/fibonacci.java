package com.c2tc_core_java;

import java.util.Scanner;

public class fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("***** Fabonacci Series *****");
		
		System.out.println("Enter number of elements in fabonacci series :");
		
		int a1 = 0, a2 = 1, a3,i,cnt;
		
		Scanner sc = new Scanner(System.in);
		
		cnt = sc.nextInt();
		

		for(i = 0; i < cnt; i++) {

			System.out.println(a1);
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
		}

	}

}
