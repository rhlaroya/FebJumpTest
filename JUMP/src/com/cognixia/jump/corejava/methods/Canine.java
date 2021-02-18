package com.cognixia.jump.corejava.methods;

public class Canine {
	public double weight;
	protected String location;
	
	//cons
	public Canine(double weight, String location) {
		this.weight = weight;
		this.location = location;
	}
	
	public void bark() {
		System.out.println("I am a canine " + this.weight + " in location: " + this.location);
	}
	
	
}
