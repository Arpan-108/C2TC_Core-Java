package com.tnsif.dayten;

import java.util.Scanner;

public class ArrayExamples {
	
	public static void displayArray(int a[]) {
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}

	public static void main(String[] args) {
		int a[]; // a is an array of integer
		
		/* Compile time error
		a[0]=12;
		System.out.println(a[0]);
		*/
		
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		n = sc.nextInt();
		a=new int[n];
		
		displayArray(a);
		
		System.out.println("Enter "+n+" numbers: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		displayArray(a);
		
		
		
	}

}
