package com.tnsif.asg3;

public class ChildThreadTwo extends Thread{
	
	public void run() {
		
		while(true) {
			System.out.println("Hi, Good Morning!! I am fine "+Thread.currentThread().getName());
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
