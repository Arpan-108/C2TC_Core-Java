package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HomogeneousList {

	public static void main(String[] args) {
		
		//Create String type list 
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Arpan");
		nameList.add("Aditya");
		nameList.add("Rushi");
		nameList.add("Ritvik");
		System.out.println("List is: "+nameList);
		Collections.sort(nameList);
		System.out.println("List is: "+nameList);
		System.out.println("--------------------------------------------------");
		//Creating Persons list
		ArrayList<Person> personList=new ArrayList<Person>(); 
		personList.add(new Person("Arpan","Nashik",9859729587L));
		personList.add(new Person("Aditya","Nashik",9883946238L));
		personList.add(new Person("Rushi","Pune",9883872388L));
		personList.add(new Person("Ritvik","Pune",9736256357L));
		personList.add(new Person("Saurabh","Nashik",9625432837L));
		System.out.println("Person List \n"+personList);

		//Printing element at a time
		System.out.println("--------------------------------------------------");
		Iterator<Person> it=personList.iterator();
		while(it.hasNext()) {
			Person p=it.next();
			System.out.println("\n"+p);
			
		}
		System.out.println("--------------------------------------------------");
		
		System.out.println(personList.size());
		
		Comparator<Person> comp=(p1, p2) -> p1.getName().compareTo(p2.getName());
		
		Collections.sort(personList, comp);
		System.out.println("-----Sorting names in Person in Ascending order-----");
		System.out.println(personList);
		
		comp=(p1,p2)-> (int) (p1.getContactNo()-p2.getContactNo());
		Collections.sort(personList, comp);
		System.out.println("-----Sorting contactNo in Person in Ascending order-----");
		System.out.println(personList);
	}

}
