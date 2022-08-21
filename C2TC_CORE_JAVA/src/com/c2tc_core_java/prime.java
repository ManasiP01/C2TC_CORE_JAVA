package com.c2tc_core_java;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
	System.out.println("***** Prime number check *****");
	
	System.out.println("Enter number :");
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int count = 0;
     if (n <= 1)
    	    count++;
    for (int i = 2; i <= n / 2; i++) {
    	
    	if (n % i == 0) {
    		count++;
    	}
      }
    if ( count > 0)
    	System.out.println("The number " + n + " is not prime");
    else
    	System.out.println("The number " + n + " is a prime");
	}

}
