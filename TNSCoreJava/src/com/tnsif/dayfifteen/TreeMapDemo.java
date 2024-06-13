package com.tnsif.dayfifteen;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, String> personMap = new TreeMap<String, String>();
		
		personMap.put("arpan@gmail.com", "Arpan");
		personMap.put("varun@gmail.com", "Varun");
		personMap.put("som@gmail.com", "Som");
		personMap.put("ritvik@gmail.com", "Ritvik");
		personMap.put("soham@gmail.com", "Soham");
				
		System.out.println(personMap);
		System.out.println("------------------------------------------------------------------------------");
		
		personMap.put("arpan@gmail.com", "Arpan Shah");
		System.out.println(personMap);
		System.out.println("------------------------------------------------------------------------------");
		
		personMap.put("arpanshah@gmail.com", "Arpan Shah");
		System.out.println(personMap);
		System.out.println("------------------------------------------------------------------------------");
		
		Set<String> emailIdSet= personMap.keySet();
		
		System.out.println("Key Set: "+emailIdSet);
		System.out.println("------------------------------------------------------------------------------");
		
		Collection<String> names=personMap.values();
		System.out.println("Values Collection: "+names);
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("Getting value through Key: "+personMap.get("arpan@gmail.com"));
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("Iterating elements Of TreeMap one by one: \n");
		Set<Entry<String, String>> persons=personMap.entrySet();
		
		Iterator<Entry<String, String>> p=persons.iterator();
		
		while(p.hasNext()) {
			
			Map.Entry<String, String> entry=p.next();
			System.out.println(entry);
		}
		System.out.println("------------------------------------------------------------------------------");

	}

}
