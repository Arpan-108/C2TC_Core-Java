package com.tnsif.dayeight.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int x=10;
		Integer intObj=new Integer(x);
		intObj=x; //auto boxing - conversion of primitive type to object
		System.out.println(intObj);
		
		intObj=20;
		x=intObj; //un-boxing - conversion from obj to primitive type
		System.out.println(x);
		
		String s="100";
		x=Integer.parseInt(s);
		System.out.println(x);
		
		/*
		 * throws NumberFormatException 
		 * s="100.0"; 
		 * x=Integer.parseInt(s);
		 * System.out.println(x);
		 */

	}

}
