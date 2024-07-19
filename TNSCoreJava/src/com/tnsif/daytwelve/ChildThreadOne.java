package com.tnsif.daytwelve;

public class ChildThreadOne extends Thread{
	
	public ChildThreadOne() {}
	
	public ChildThreadOne(String name) {
		
	}
	
	public void run() {
		
		try {
			MyTask.sayHello(10);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
