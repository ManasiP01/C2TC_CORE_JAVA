package com.hm1;

import java.util.*;

public class As_list {

	public static void main(String[] args) {
		
		Integer [] arr = new Integer[] {1,2,3,4,5,6,7,8,9};		//Creating array of Integer (wrapper Class) type
		
//		Getting list view of array
		List<Integer> list = Arrays.asList(arr);
		
//		Printing array
		System.out.println("Array list is " + list);
	}

}
