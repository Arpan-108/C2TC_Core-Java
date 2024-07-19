package com.tnsif.daysix.multilevel;

public class ClassA {
	private int num; // data member
	
	public ClassA() {
		
		this(5); //this.num = 5;
		System.out.println("ClassA Default Constructor");
	}

	public ClassA(int num) {
		
		this.num = num; //this.num refers data member
		System.out.println("ClassA Parameterized Constructor");
	}
	
	public void show() {
		
		System.out.println("Number: "+this.num);
	}
	
}
