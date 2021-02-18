package com.cognixia.jump.exercise;

public class MissningNo {
	public static void main(String[] args) {

		int [] nset = {1,2,3,4,5,6,7,8,9,11};
		System.out.println(identify(nset));
	
	}
	
	// sum of all natural numbers expressed as length time length + 1 / 2
	// sum of all number in array minus sum of natural numbers
	public static int identify(int nset[]) {
		int natsum = nset.length*(nset.length+1)/2;
		int total = 0;
		for(int i = 0; i < nset.length; i++) {
			total = total + i;
		}
		return (natsum - total);
	}
}
