package com.tnsif.dayninteen;

import java.util.ArrayList;

public class GenericsInJava {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		// list.add(123);
		
		for(Object object:list) {
			
			//Below statement throws ClassCastException at run time
			//String string=(String) object; //Type casting
			System.out.println(object);
		}

	}

}
