package com.c2tc_core_java;

import java.util.Scanner;

public class duplicate_string {

	public static void main(String[] args) {
		
		System.out.println("***** Find duplicate characters in string *****");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string is: ");
		String str1=sc.nextLine();
		int count;
		char str[] = str1.toCharArray();
		System.out.println("Duplicate characters in the given string: ");
		for(int i = 0; i <str.length;i++) {
			
		count = 1;
		for(int j = i+1; j <str.length; j++) {
		if(str[i] == str[j] && str[i] !=' ') 
		{
			count++;
			str[j] = '0';
		   }
	}
		if(count > 1 && str[i] != '0')
		System.out.println(str[i]);
		}
	}

}
