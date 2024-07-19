package com.tnsif.dayfifteen;

import java.util.Collections;
import java.util.HashSet;

import org.w3c.dom.ls.LSOutput;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs1 = new HashSet<Integer>();
		System.out.println(hs1.add(60));
		hs1.add(90);
		hs1.add(20);
		hs1.add(70);
		System.out.println(hs1.add(60));
		hs1.add(50);
		hs1.add(80);
		
		System.out.println("First Set: "+hs1);
		System.out.println("----------------------------------");
		
		//sort() not applicable for HashSet
		//Collections.sort(hs);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(600);
		hs2.add(90);
		hs2.add(200);
		hs2.add(70);
		hs2.add(50);
		hs2.add(800);
		
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		System.out.println("Union");
		hs1.addAll(hs2); //Union
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		hs1.clear();
		hs1.add(60);
		hs1.add(90);
		hs1.add(20);
		hs1.add(70);
		hs1.add(50);
		hs1.add(80);
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		System.out.println("Intersection");
		hs1.retainAll(hs2); // Intersection
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		hs1.clear();
		hs1.add(60);
		hs1.add(90);
		hs1.add(20);
		hs1.add(70);
		hs1.add(50);
		hs1.add(80);
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
		System.out.println("Set Difference");
		hs1.remove(hs2); //Set Difference
		
		System.out.println("First Set: "+hs1);
		System.out.println("Second Set: "+hs2);
		System.out.println("----------------------------------");
		
	}

}
