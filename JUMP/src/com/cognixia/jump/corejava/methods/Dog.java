package com.cognixia.jump.corejava.methods;

public class Dog extends Canine {
	
	String breed;
	
	public Dog (double weight, String location, String breed) {
		super(weight, location);
		this.breed = breed;
	}
	
	//Method override keep signature the same, must have inhertance,
	//changing code inside curly braces
	//runtime polymorphism.
	@Override
	public void bark() {
		
		System.out.println("I am a dog " + this.weight + " in location: " + this.location + "and breed" + this.breed);
	}
	
	public String bark(String sound, int volume) {
		return sound+ "at volume" + volume+ this.weight + " " + this.location + " " + this.breed;
	}
}
