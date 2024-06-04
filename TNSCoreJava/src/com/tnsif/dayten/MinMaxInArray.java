//Program to find min max of array
package com.tnsif.dayten;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxInArray {
	
	public static void minMaxOfArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Max: "+ a[a.length-1]);
		System.out.println("Min: "+ a[0]);
	}

	public static void displayArray(int a[]) {
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
	
	public static void search(int []a,int num)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("number is present");
			}
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		n = sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter "+n+" numbers: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		//sort the array elements
		Arrays.sort(a);
		
		//find minimum and maximum of the array
		minMaxOfArray(a);
		
		//display the array
		displayArray(a);
		
		//search element in array
		search(a, n);
		
		
		
	}

}
