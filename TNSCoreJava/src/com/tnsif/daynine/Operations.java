//Program to demonstrate method overloading - Defining same name methods with different
//signatures in same scope
//(signature-different no of parameters
//          -different data types
//          -different order of variable)
package com.tnsif.daynine;

public class Operations {
	
	//without parameter
	public static void add() {
		
		System.out.println("Addition");
	}
	
	//with one parameter
	public static void add(int a) {
		
		System.out.println("Addition is "+a);
	}
	
	//with two parameter
	public static void add(int a, int b) {
		
		System.out.println("Addition is: " + (a+b));
	}
	
	public static void add(float a, int b) {
		
		System.out.println("Addition is: " + (a+b));
	}
	
	public static void add(int a, float b) {
		
		System.out.println("Addition is: " + (a+b));
	}
}
