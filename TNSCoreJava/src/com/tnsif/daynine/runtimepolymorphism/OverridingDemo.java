package com.tnsif.daynine.runtimepolymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		
		ClassA obj;
		
		obj=new ClassA();
		obj.setN(10);
		obj.show(); //show() of ClassA
		
		obj=new ClassB();
		obj.setN(20);
		obj.show(); //show() of ClassB
		
		ClassB bObj=new ClassB();
		bObj.setName("Arpan");
		bObj.show();
		
		Person person = new Person("Arpan","Nashik");
		Student student=new Student(101,"IT","Rishi","Pune");
		
		System.out.println(person);
		System.out.println(student);
	}

}
