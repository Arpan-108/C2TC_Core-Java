package com.tnsif.dayseventeen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList=new ArrayList<Integer>();
		numList.add(40);
		numList.add(80);
		numList.add(20);
		numList.add(90);
		numList.add(10);
		numList.add(70);
		numList.add(30);
		System.out.println("Num List");
		System.out.println("------------Befor sorting-------------");
		System.out.println("\n"+numList);
		Collections.sort(numList);
		System.out.println("\n------------Sorting on Ascending-------------");
		System.out.println("\n"+numList);
		
		Comparator<Integer> comp = (n1,n2) -> n2-n1;
		Collections.sort(numList, comp);
		
		System.out.println("\n------------Sorting on Descending-------------");
		System.out.println("\n"+numList);
		System.out.println("_____________________________________________________________________________");
		
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Arpan");
		nameList.add("Aditya");
		nameList.add("Rushi");
		nameList.add("Ritvik");
		nameList.add("Som");
		nameList.add("Soham");
		nameList.add("Nayan");
		nameList.add("Nagarjun");
		
		System.out.println("\nName List");
		System.out.println("\n------------Befor sorting-------------");
		System.out.println("\n"+nameList);
		Collections.sort(nameList);
		System.out.println("\n------------Sorting on Ascending-------------");
		System.out.println("\n"+nameList);
		
		Comparator<String> comp1=(s1,s2) -> s2.compareTo(s1);
		Collections.sort(nameList, comp1);
		
		System.out.println("\n------------Sorting on Descending-------------");
		System.out.println("\n"+nameList);
		System.out.println("_____________________________________________________________________________");
		
		ArrayList<Student> studList=new ArrayList<Student>();
		studList.add(new Student(10,"Arpan",89,"IT"));
		studList.add(new Student(21,"Nagarjun",91,"IT"));
		studList.add(new Student(16,"Som",95,"BioTech"));
		studList.add(new Student(18,"Ritvik",90,"BioTech"));
		studList.add(new Student(22,"Sharad",87,"Comp"));
		studList.add(new Student(24,"Rushi",88,"Comp"));
		studList.add(new Student(14,"Soham",89,"AI&ML"));
		
		System.out.println("\nStudent List");
		System.out.println("\n------------Befor sorting on name-------------");
		System.out.println("\n"+studList);
		
		Comparator<Student> studComp = (s1,s2) -> s1.getName().compareTo(s2.getName());
		
		Collections.sort(studList, studComp);
		
		System.out.println("\n------------Sorting in Ascending on Name-------------");
		System.out.println("\n"+studList);
		
		System.out.println("\n------------Befor sorting on stream-------------");
		System.out.println("\n"+studList);
		
		Comparator<Student> studComp1 = (s1,s2) -> s2.getStream().compareTo(s1.getStream());
		
		Collections.sort(studList, studComp1);
		
		System.out.println("\n------------Sorting in Descending on Stream-------------");
		System.out.println("\n"+studList);
	}

}
