package com.cognixia.jump.exercise;

public class ReverseWord {
	public static void main(String[] args) {
		System.out.println(reversal("airaM"));
	}
	
	public static String reversal(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
