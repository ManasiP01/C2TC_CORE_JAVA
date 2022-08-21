package com.c2tc_core_java;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		
		System.out.println("***** Reverse string *****");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to reverse : ");
		
		String st = sc.nextLine();
		
		String rst = new StringBuilder(st).reverse().toString();
		
		System.out.println("Reverse string : \n"+ rst);
	}

}
