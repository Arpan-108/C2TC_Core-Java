package com.tnsif.daysixteen;

public class StringFunctions {

	public static void main(String[] args) {

		String a="Hello! How are you?";
		System.out.println("String a: "+a);
		System.out.println("Length of a: "+a.length());
		System.out.println("Check if String starts with 'Hello': "+a.startsWith("Hello"));
		System.out.println("Check if String ends with '?': "+a.endsWith("?"));
		System.out.println("Return element at 7 index: "+a.charAt(7));
		System.out.println("Return element at 15 index: "+a.charAt(15));
		System.out.println("Return index of e: "+a.indexOf("e"));
		System.out.println("Return last index of e: "+a.lastIndexOf("e"));
		System.out.println("Return index of z: "+a.indexOf("z"));
		System.out.println("String to uppercase: "+a.toUpperCase());
		System.out.println("String to lowercase: "+a.toLowerCase());
		System.out.println("Substring 7-last: "+a.substring(7));
		System.out.println("Substring 7-10: "+a.substring(7,10));
		System.out.println("Check if Hi is present? "+a.contains("Hi"));
		System.out.println("Replace Hello to Hi: "+a.replace("Hello", "Hi"));
		System.out.println("Initial String: "+a);
		
	}
}
