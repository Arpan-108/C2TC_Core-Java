package com.tnsif.daysix.multilevel;

public class ClassC extends ClassB {
	
	private float per;
	
	public ClassC() {
		
		this(108, "Rushi", 80.9f);
		System.out.println("ClassB Default Constructor");
	}

	public ClassC(int num, String name, float per) {
		
		super(num, name);
		this.per = per;
		System.out.println("ClassC Parameterized Constructor");
	}
	
	public void show() {
		
		super.show();
		System.out.println("Percentage: "+this.per);
	}
}
