package com.tnsif.dayninteen;

import com.tnsif.dayfourteen.Student;

public class Demo {

	public static void main(String[] args) {
		
		GenericMethodClass obj=new GenericMethodClass();
		obj.show(10);
		obj.show("Hello");
		obj.show(45.10);
		obj.show(true);
		obj.show(new Student(1, "Arpan", 70));
		
	}

}
