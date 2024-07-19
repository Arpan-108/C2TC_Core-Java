package com.tnsif.daysix.multilevel;

public class ClassB extends ClassA {
	
	private String name;
	
	public ClassB() {
		
		this(10 ,"PVG Student");
		System.out.println("ClassB Default Constructor");
	}

	public ClassB(int num, String name) {
		super(num);
		this.name = name;
		System.out.println("ClassB Parameterized Constructor");
	}
	
	public void show() {
		
		super.show();
		System.out.println("Name: "+this.name);
	}
}
