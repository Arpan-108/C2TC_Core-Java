package com.tnsif.dayeight;

public class InterfaceDemo {

	public static void main(String[] args) {
		MyInterface obj;
		obj=new ClassA();
		obj.show();
		
		ClassB objB=new ClassB();
		objB.show();
		System.out.println(objB.greet());
		
		ClassD objD=new ClassD();
		objD.display();

	}

}
