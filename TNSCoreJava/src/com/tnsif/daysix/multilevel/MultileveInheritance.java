package com.tnsif.daysix.multilevel;

public class MultileveInheritance {

	public static void main(String[] args) {
		
		ClassA a1 = new ClassA();
		a1.show();
		System.out.println("------------------------------------------");
		
		ClassA a2 = new ClassA(10);
		a2.show();
		System.out.println("------------------------------------------");
		
		ClassB b1 = new ClassB();
		b1.show();
		System.out.println("******************************************");
		
		ClassB b2 = new ClassB(27, "Arpan");
		b2.show();
		System.out.println("******************************************");
		
		ClassC c1 = new ClassC();
		c1.show();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		ClassC c2 = new ClassC(32, "Rutvik", 70.45f);
		c2.show();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
