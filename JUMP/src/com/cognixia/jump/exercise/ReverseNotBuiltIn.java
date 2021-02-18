package com.cognixia.jump.exercise;

public class ReverseNotBuiltIn {
	public static void main(String[] args) {
		
		String word = "eageR";
		char [] holder = word.toCharArray();
		for(int i = holder.length - 1; i >= 0; i--) {
			System.out.print(holder[i]);
		}
		
	}
	
}
