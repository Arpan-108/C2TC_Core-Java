package com.tnsif.asg3;

public class ChildThread extends Thread{
	
	String msg;
	
	public ChildThread() {}
	
	public ChildThread(String msg) {
		this.msg=msg;
	}
	
	public void run() {
		while(true) {
			System.out.println(msg);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
