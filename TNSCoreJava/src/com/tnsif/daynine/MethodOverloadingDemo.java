package com.tnsif.daynine;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Operations.add();
		Operations.add(12);
		Operations.add(12, 45);
		Operations.add(45.12f, 12);
		
		System.out.println("\n");
	}

}
