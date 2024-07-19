package com.tnsif.daysixteen;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="Hello"; //Literal - allocates on string pool
		String s2="Hello"; //Literal - points to same area on string pool
		String s3=new String("Hello"); // allocates on heap memory
		
		System.out.println("Is s1==s2? "+(s1 == s2));
		System.out.println("Is s1==s3? "+(s1 == s3));
		System.out.println("________________________________________________________________________");
		
		System.out.println("Is s1.equals(s2)? "+s1.equals(s2));
		System.out.println("Is s1.equals(s3)? "+s1.equals(s3));
		System.out.println("________________________________________________________________________");
		
		String s4=s1; //Points to the same area on string pool as s1
		System.out.println("Is s1==s4? "+(s1 == s4));
		System.out.println("Is s1.equals(s4)? "+s1.equals(s4));
		System.out.println("________________________________________________________________________");
		
		String s5=new String("Hello"); //allocates another new memory  on Heap
		System.out.println("Is s3==s5? "+(s3 == s5));
		System.out.println("Is s3.equals(s5)? "+s3.equals(s5));
		System.out.println("________________________________________________________________________");

		String s6 =s3; //Points to same area on heap as (s3)
		System.out.println("Is s3==s6? "+(s3 == s6));
		System.out.println("Is s3.equals(s6)? "+s3.equals(s6));
		System.out.println("________________________________________________________________________");
		
		String s7=s3.intern(); //Points to the same area on string pool if it is available
		System.out.println("Is s3==s7? "+(s3 == s7));
		System.out.println("Is s3.equals(s7)? "+s3.equals(s7));
		System.out.println("Is s1==s7? "+(s1 == s7));
		System.out.println("________________________________________________________________________");
		
		String s8=new String("Hi"); //allocates new memory on heap
		String s9=s8.intern(); // allocates new memory on string pool
		System.out.println(s9);
		System.out.println("Is s8==s9? "+(s8==s9));
		System.out.println("________________________________________________________________________");
	}

}
