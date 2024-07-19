package com.tnsif.asg3;

public class ChildThreadOne extends Thread{
	
	public void run() {
		
		while(true) {
			System.out.println("Hello, How are you? "+ Thread.currentThread().getName());
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
