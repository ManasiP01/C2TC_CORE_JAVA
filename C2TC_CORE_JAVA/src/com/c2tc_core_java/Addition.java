package com.c2tc_core_java;

import java.util.Scanner;

public class Addition {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		System.out.println("Give two numbers for addition :");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		System.out.println("Addition = " + (c = a+b));

	}

}
