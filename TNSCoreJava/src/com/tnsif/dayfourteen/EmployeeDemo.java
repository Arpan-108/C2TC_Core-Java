package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(108,"Arpan",45000));
		empList.add(new Employee(103,"Som",65000));
		empList.add(new Employee(110,"Aditya",50000));
		empList.add(new Employee(104,"Ritvik",75000));
		empList.add(new Employee(124,"Varun",400000));
		
		System.out.println("Employee Details: \n"+empList);
		System.out.println("--------------------------------------------------");
		System.out.println();
		Collections.sort(empList, new SortByEmployeeName());
		System.out.println("-----Employee Details in Ascending order of Name-----\n");
		System.out.println(empList);
		Collections.sort(empList, new SortByEmployeeSalary());
		System.out.println();
		System.out.println("-----Employee Details in Ascending order of Salary-----\n");
		System.out.println(empList);
	}

}
