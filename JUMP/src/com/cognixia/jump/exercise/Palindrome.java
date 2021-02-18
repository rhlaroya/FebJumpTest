package com.cognixia.jump.exercise;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(reversal("ama"));
	}
	

	public static boolean reversal(String s) {
		StringBuilder sb = new StringBuilder(s);
		boolean match = false;
			if (s.equals(sb)) {
				return match = true;
			} else {
				return match = false;
			}
			
		
	}
}
