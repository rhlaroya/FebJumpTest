package com.cognixia.jump.corejava.methods;

public class MethodDriver {
	public static void main(String[] args) {
		
		//make a canine and see the effectof .bark()
		Canine canine  = new Canine(20.0, "US");
		canine.bark();
		
		Dog dog = new Dog(15.0, "Europe", "Lab");
		dog.bark();
	}
	
}
