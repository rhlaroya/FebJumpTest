package com.cognixia.jump.corejava;

public class StaticClass {
	
	//class attributes
	public int number;
	
	//anonymous block
	{
		System.out.println("This is our anonymous block");
	}
	
	//static bloick
	static {
		System.out.println("This is our static block");
	}
	
	//contructor
	public StaticClass(int number) {
		this.number = number;
		System.out.println("This is the constructor with number:" + number);
	}
	
	//static method
	public static void staticMethod() {
		System.out.println("This is the static method");
	}
	
	public void instanceMethod() {
		System.out.println("This is the instance method");
	}

}
