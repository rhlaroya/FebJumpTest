package com.cognixia.jump.corejava;

//quick example of order of execution of constructors, static blocks
// and methods and an anonymous block
public class StaticExampleDriver {

	public static void main(String args []) {
		
		
		// make a object 
		StaticClass sc = new StaticClass(5);
		
		// mkae another object
//		StaticClass sc2 = new StaticClass(3);	
//		
//		StaticClass sc3 = new StaticClass(1);
//		
		StaticClass.staticMethod();
		
		sc.instanceMethod();
		
		
	}

}
