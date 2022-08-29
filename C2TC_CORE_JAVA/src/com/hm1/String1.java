package com.hm1;

public class String1 {

	public static void main(String[] args) {
		
//		String comparison using equals()
		
		String s1 = new String("Hello");
		String s3 = new String("Hello");		
		String s2 = new String("abc");
		String a1 = "ABC";
		String a2 = "ABC";
		
//		System.out.println(a1.equals(a2));		// true
//		System.out.println(s1.equals(s2));		// false
//		System.out.println(s1.equals(s3));		// true
//		System.out.println(s2.equals(a1));		//false
//		System.out.println(s2.equalsIgnoreCase(a1));		//true
		
//		Comparison using == operator
		
		System.out.println(s1 == s3);		//false
		System.out.println(a1 == a2);		//true
		System.out.println(a1 == s2);		//false
		
//		Comparison using compareTo()
		System.out.println(s1.compareTo(s3));		// 0
		System.out.println(a1.compareTo(a2));		// 0
		System.out.println(a1.compareTo(s2));		// -ve value
		System.out.println(a1.compareToIgnoreCase(s2));		// 0
		System.out.println(a1.compareTo(s1));		// -ve value
		System.out.println(s1.compareTo(a1));		// +ve value
		
	}

}
