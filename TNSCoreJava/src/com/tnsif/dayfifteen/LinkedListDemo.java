package com.tnsif.dayfifteen;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> cityList= new java.util.LinkedList<String>();
		
		cityList.add("Nashik");
		cityList.add("Pune");
		cityList.add("Mumbai");
		
		System.out.println(cityList);
		System.out.println("----------------------------------");
		cityList.add(2,"Delhi");
		System.out.println(cityList);
		System.out.println("----------------------------------");
		cityList.addFirst("Hyderabad");
		cityList.addLast("Chennai");
		System.out.println(cityList);
		System.out.println("----------------------------------");
		
		System.out.println("First city: "+cityList.getFirst());
		System.out.println("Last city: "+cityList.getLast());
		System.out.println("City at position 2: "+cityList.get(2));
		System.out.println("----------------------------------");
		System.out.println("Remove city at position 2: "+cityList.remove(2));
		System.out.println("List after removing element at 2 position: \n"+cityList);
		//IndexOutOFBoundException : Index: 10, size : 5
		//System.out.println("Remove city at position 10: "+cityList.remove(10));
		
		System.out.println("\nMumbai city removed?: "+cityList.remove("Mumbai"));
		System.out.println("Mumbai city removed?: "+cityList.remove("Bangalore"));
		System.out.println("Removes first city: "+cityList.removeFirst());
		System.out.println("Removes last city: "+cityList.removeLast());
		System.out.println("\nList after Removings: "+cityList);
		
		System.out.println("----------------------------------");
		System.out.println("List cleared cityList.clear(): ");
		cityList.clear(); //remove all values
				
		System.out.println("City List : "+cityList);
		System.out.println("Size : "+cityList.size());
		
		//throws NoSuchElementException as List is empty(Size is 0)
		//System.out.println("Removes first city: "+cityList.removeFirst());
		
		System.out.println("----------------------------------");
		System.out.println("Adding new elements in list: \n");
		
		cityList.add("Mumbai");
		cityList.add("Delhi");
		cityList.add("Nagpur");
		cityList.add("Ahmedabad");
		cityList.add("Nasik");
		cityList.add("Pune");
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		cityList.add("Chennai");
		
		System.out.println(cityList);
		System.out.println("\nSize : "+cityList.size());
		System.out.println("----------------------------------");
		
		ListIterator<String> lit=cityList.listIterator();
		System.out.println("Using ListIterator to traverse the list.\n");
		while(lit.hasNext())
			System.out.println(lit.next().toUpperCase());
		System.out.println("----------------------------------");

		System.out.println("Using Iterator to perform operation on List such as add,remove,set(replace).");	
		System.out.println("remove() Delhi \nadd('Jaipur') \nset Nasik to Nashik-> set(Nashik)");
				
		lit=cityList.listIterator();
		while(lit.hasNext()) {
			
			String city=lit.next();
			if (city.equals("Delhi"))
				lit.remove();
			if (city.equals("Nasik"))
				lit.set("Nashik");
			if (city.equals("Nagpur"))
				lit.add("Jaipur");
		}
		
		System.out.println("\nCities List after Operations: \n");
		System.out.println(cityList);
		System.out.println("----------------------------------");
		
		System.out.println("Reverse Iterating the List using ListIterator: \n");
		lit=cityList.listIterator(cityList.size());
		while(lit.hasPrevious()) {
			
			System.out.println(lit.previous());
		}
		System.out.println("----------------------------------");
		
	}

}
