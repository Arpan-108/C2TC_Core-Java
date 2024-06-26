package com.tnsif.dayninteen;

import java.util.ArrayList;
import java.util.List;

public class UserGenericMethod {
	
	/*
	public void display(int[] a) {
		for(int n:a) {
			System.out.println(n);
		}
	}
	
	public void display(String[] a) {
		for(String n:a) {
			System.out.println(n);
		}
	}
	
	public void display(float[] a) {
		for(float n:a) {
			System.out.println(n);
		}
	}*/
	
	//Generic Method
	public <T> void display(T[] a) {
		for(T n:a) {
			System.out.println(n);
		}
	}
	
	//Unbounded Wildcard
	public void displayArray(List<?> a) {
		
		for(Object n:a) {
			System.out.println(n);
		}
	}
	
	//Upper Bounded Wildcard
	public void sumOfElements(List<? extends Number> a) {
		
		Double s=0.0;
		for(Number n:a) {
			s += n.doubleValue();
		}
		System.out.println("Sum is: "+s);
	}
	
	//Lower Bounded Wildcard
		public void displayIntArray(List<? super Integer> a) {
			
			for(Object n:a) {
				System.out.println(n);
			}
		}
	
	public static void main(String args[]) {
		
		UserGenericMethod obj=new UserGenericMethod();
		/*
		 * As Generics works with objects not primitive datatypes
		 * int[] a= {10,20,304,50};
		 * float[] f= {12.56f,70,67.80f};
		 */
	
		String[] s= {"Nashik","Pune","Delhi"};	
		
		Integer[] a= {10,20,304,50};
		
		obj.display(s);
		obj.display(a);
		
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		obj.displayArray(intList);
		System.err.println("_______________________________________________________________________________________________");
		
		List<String> strList=new ArrayList<String>();
		strList.add("Nashik");
		strList.add("Delhi");
		strList.add("Pune");
		
		obj.displayArray(strList);
		System.err.println("_______________________________________________________________________________________________");
		
		obj.sumOfElements(intList);
		System.err.println("_______________________________________________________________________________________________");
		
		List<Float> priceList=new ArrayList<Float>();
		priceList.add(400.0f);
		priceList.add(1400.0f);
		priceList.add(6000.0f);
		
		obj.sumOfElements(priceList);
		System.err.println("_______________________________________________________________________________________________");
		
		obj.displayIntArray(intList);
	}
}
