package com.cognixia.jump.exercise;

import java.util.Arrays;
public class ArrayMatch {
	public static void main(String[] args) {
		
		int [] arr1 = {0,1,2,3};
		int [] arr2 = {0,1,2,3};
		if(match(arr1, arr2) != true) {
			System.out.println("Arrays do not match");
		} else if (match(arr1, arr2) == true) {
			System.out.println("It's a match!");
		}
	}
	
	//if the length are different = not a match
	// else if length are same check contents
	public static boolean match(int arr1[], int arr2[]) {
		boolean match = false;
		if (arr1.length != arr2.length) {
			match = false;
		} else if (arr1.equals(arr2)) {
			match = false;
		} 
		else if (Arrays.equals(arr1, arr2)) {
		match = true;
	}
		return match;
}
}
