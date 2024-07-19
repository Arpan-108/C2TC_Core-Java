package com.tnsif.dayseventeen;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		System.out.println("----------------in main----------------");
		
		//first implementation
		Runnable r = () -> {
			
			for (int i=0;i<=50;i++) {
				System.out.println(Thread.currentThread().getName()+" Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}; 
		
		//create child thread
		Thread t1=new Thread(r, "Thread1");
		
		Thread t2=new Thread(r, "Thread2");
		t1.start();
		t2.start();

		//second implementation
		r=() -> {
			int i =2;
			while(i<=100) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				i+=2;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		
		Thread t3=new Thread(r,"Thread3");
		t3.start();
	}

}
