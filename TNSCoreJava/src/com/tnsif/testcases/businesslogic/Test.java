package com.tnsif.testcases.businesslogic;

public class Test {

	public static void main(String[] args) {
		
		int n=3;
		boolean r = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				
				r=true;
				break;
			}
		}
		
		System.out.println(r);
	}
	

}
