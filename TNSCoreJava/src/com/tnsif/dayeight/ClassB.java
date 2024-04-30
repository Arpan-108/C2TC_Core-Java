package com.tnsif.dayeight;

public class ClassB implements MyInterface, FirstInterface{

	@Override
	public String greet() {
		
		return "HELLO";
	}

	@Override
	public void show() {
		System.out.println("Show() overridden from Myinterface");
		
	}
	
}
