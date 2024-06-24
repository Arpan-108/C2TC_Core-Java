package com.tnsif.dayninteen;

import com.tnsif.dayfourteen.Student;

public class Demo {

	public static void main(String[] args) {
		
		//Using generic method
		GenericMethodClass obj=new GenericMethodClass();
		obj.show(10);
		obj.show("Hello");
		obj.show(45.10);
		obj.show(true);
		obj.show(new Student(1, "Arpan", 70));
		System.err.println("_______________________________________________________________________________________________");
		
		//Using generic class
		//Create array of Integer
		Integer a[]= {101,20,30,40,50};
		GenericClass<Integer> intArray=new GenericClass<Integer>(a);
		intArray.printArray();
		
		//Create array of String
		String s[]= {"Hi", "Hello", "Good Afternoon", "Bye"};
		GenericClass<String> strArray=new GenericClass<String>(s);
		strArray.printArray();
		System.err.println("_______________________________________________________________________________________________");
		
		//Using generic interface
		MyGenericClass obj1=new MyGenericClass();
		
		System.out.println(obj1.getMax(a));
		System.out.println(obj1.getMin(a));

		System.out.println(obj1.getMax(s));
		System.out.println(obj1.getMin(s));
	
	}

}
