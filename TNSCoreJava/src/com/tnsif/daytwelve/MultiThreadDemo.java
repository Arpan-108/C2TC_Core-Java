package com.tnsif.daytwelve;

public class MultiThreadDemo {

	public static void main(String[] args) {
		MyChildThread m = new MyChildThread();
		/*
		 * Thread thread=new Thread(m); thread.setName("ChildThread");
		 */
		
		Thread t = new Thread(m, "Child Thread");
		t.setPriority(10);
		t.start();
	}

}
