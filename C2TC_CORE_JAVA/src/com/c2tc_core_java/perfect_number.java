package com.c2tc_core_java;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		
	System.out.println("***** Perfect number *****");
	
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number: ");
    
    int num = sc.nextInt();
    
    int sum = 0,i=1;
    while(i < num){
    	
    	if(num % i == 0) {
    		sum = sum + i;
    	}
    	i++;
    	}
    
    if(sum == num) {
    	System.out.println("The number " + num + " is perfect number");
    }
    else {
    	System.out.println("The number " + num + " is not perfect number");
    }
    }
}
