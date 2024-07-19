package com.tnsif.daythirteen.interthreadcommunication;

public class ConsumerThread extends Thread{
	
	Product p;

	public ConsumerThread(Product p) {
		super();
		this.p = p;
	}
	
	public void run() {
		while(true) {
			try {
				p.get();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
