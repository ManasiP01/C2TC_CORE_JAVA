package com.c2tc_core_java;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		
		System.out.println("***** Palindrome string *****");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		
		String st = sc.nextLine();
		String rst = new StringBuilder(st).reverse().toString();
		
		if(st.equals((rst))) {
			System.out.println(st + " is palindrome");
		}
		else {
			System.out.println(st + " is not palindrome");
		}

	}

}
