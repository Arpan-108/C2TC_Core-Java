package com.tnsif.daythirteen.synchronization;

public class AccountThread extends Thread {
	
	private Account acc;
	private float amt;
	
	public AccountThread(Account acc, float amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}
	
	public void run() {
		//Synchronized block allowing only one thread to run at a time
		//synchronized (acc){
			acc.withdraw(amt);
			
		//}
	}
}
