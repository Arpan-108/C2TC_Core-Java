package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Raw List -->Heterogeneous elements 
		ArrayList a=new ArrayList();
		
		System.out.println(a.add(10));
		a.add(20);
		a.add(30);
		a.add(5);
		a.add(3);
		System.out.println("Arraylist is : "+a);
		System.out.println("Size of array is: "+a.size());
		a.add(45);
		a.add(50);
		a.add(10);
		/*
		 * a.add("Hello"); 
		 * a.add(5.0); //Throws java.lang.ClassCastException when performing sorting as data types are different 
		 *
		 */
		System.out.println("Arraylist is : "+a);
		System.out.println("Is 30 present: "+a.contains(30));
		System.out.println("Is 300 present: "+a.contains(300));
		System.out.println("Index of 20 is: "+a.indexOf(20));
		System.out.println("Last index of 10 is: "+a.lastIndexOf(20));
		System.out.println("***************************************");
		System.out.println("Giving index of value in remove(3)-- value=5: "+a.remove(3));
		System.out.println("List after remove: "+a);
		System.out.println(a.remove(a.indexOf(10)));
		System.out.println("List after remove: "+a);
		System.out.println(a.remove(Integer.valueOf(30)));
		System.out.println("List after remove: "+a);
		Collections.sort(a);
		System.out.println("List after sorting: "+a);
		
		Iterator i=a.iterator();
		System.out.println("---------------------------------------");
		while(i.hasNext())
			System.out.println(i.next());
		
		

	}

}
