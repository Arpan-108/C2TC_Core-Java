package com.tnsif.asg3;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("--------------Main Starts-------------");
		
		//Using Two different ChildThread classes
		ChildThreadOne t1 = new ChildThreadOne();
		ChildThreadTwo t2 = new ChildThreadTwo();
		
		t1.setName("Teacher");
		t2.setName("Student");
		
		t1.start();
		t2.start();
		
		//Using single ChildThread and making two objects of it
		
		ChildThread t3 = new ChildThread("Hello, How are you?");
		ChildThread t4 = new ChildThread("Hi, Good Morning!! I am fine");
		
		t3.start();
		t4.start();
		
		System.out.println("--------------Main Ends---------------");
	}
}
