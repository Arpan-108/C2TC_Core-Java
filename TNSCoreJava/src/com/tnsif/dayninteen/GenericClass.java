package com.tnsif.dayninteen;

public class GenericClass<T> {

	//Generic Variable
	T myArray[];

	//Generic Constructor
	public GenericClass() {  }

	public GenericClass(T[] myArray) {
		
		this.myArray = myArray;
	}		
	
	void printArray() {
		
		for(T n:myArray) {
			System.out.println(n);
			
		}
	}
}
