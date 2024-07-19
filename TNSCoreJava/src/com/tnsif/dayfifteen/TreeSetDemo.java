package com.tnsif.dayfifteen;

import java.util.Comparator;
import java.util.TreeSet;

import com.tnsif.dayfourteen.Employee;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> courseSet=new TreeSet<String>();
		
		courseSet.add("Java");
		courseSet.add("C++");
		courseSet.add("Python");
		courseSet.add("C");
		courseSet.add("React");
		courseSet.add("Angular");
	
		System.out.println(courseSet);
		System.out.println("First Course: "+courseSet.first());
		System.out.println("Last Course: "+courseSet.last());
		System.out.println("----------------------------------------------------");
		
		//Remove Course "C" if present
		System.out.println("Removing element C: "+courseSet.remove("C"));
		System.out.println(courseSet);
		System.out.println("----------------------------------------------------");
		
		//removes First element
		System.out.println("Removes First Element: "+courseSet.pollFirst());
		System.out.println(courseSet);
		System.out.println("----------------------------------------------------");
		
		//removes Last element
		System.out.println("Removes Last Element: "+courseSet.pollLast());
		System.out.println(courseSet);
		System.out.println("----------------------------------------------------");
		
		//course.add(null); //throws NullPointerException 
		
		//Creating TreeSet for Employee Class Type
		Comparator<Employee> comp1=(e1,e2)-> e1.getEmpId()-e2.getEmpId();
		
		Comparator<Employee> comp2=(e1,e2)-> (int) (e1.getSalary()-e2.getSalary());
		
		Comparator<Employee> comp3=(e1,e2)-> e1.getName().compareTo(e2.getName());
		
		TreeSet<Employee> empSet=new TreeSet<Employee>(comp3);
		empSet.add(new Employee(108,"Arpan",45000));
		empSet.add(new Employee(103,"Som",65000));
		empSet.add(new Employee(110,"Aditya",50000));
		empSet.add(new Employee(104,"Ritvik",75000));
		empSet.add(new Employee(124,"Varun",400000));
		
		System.out.println("Employee Details : \n"+empSet);
		
	}

}
