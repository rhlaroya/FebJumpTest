package com.cognixia.jump.exercise;

public class Fib {
	public static void main(String[] args) {
		System.out.print("0,1,");
		sequence(10);
	}
	

	public static int sequence(int limit) {
		int n1 = 0;
		int n2 = 1;
		int temp = 0;
		for(int i = 0; i <= limit; i++) {
			temp = n1 + n2; 
			n1 = n2;
			n2 = temp;
			System.out.print(temp + ",");
		}
		return temp;
	}
}
