package com.tnsif.daytwelve;

public class MultiThreadedApplication {

	public static void main(String[] args) {
		System.out.println(".....in main function() ....."+Thread.currentThread());		
		
		ChildThreadOne t1=new ChildThreadOne();
		
		ChildThreadTwo t2=new ChildThreadTwo();
		
		ChildThreadOne t3=new ChildThreadOne();
		
		t1.start(); //run() method called implicitly
		t2.start();
		t3.start();
		//t1.start(); // gives exception(IllegalThreadStateException) if thread called again
		
		System.out.println(".....End of Main.....");
		


	}

}
