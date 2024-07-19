package com.tnsif.dayeighteen.userdefinedfunctionalinterface;

public class Demo {

	public static void main(String[] args) {

		ArithmeticOperation op;
		int result;
		
		op = (x,y)->x+y;
		result=op.perform(10,2);
		System.out.println("Addition is: "+result);
		
		op = (x,y)->x-y;
		result=op.perform(10,2);
		System.out.println("Substraction is: "+result);

		op = (x,y)->x*y;
		result=op.perform(10,2);
		System.out.println("Multiplication is: "+result);

		op = (x,y)->x/y;
		result=op.perform(10,2);
		System.out.println("Division is: "+result);
		
		op=(x,y) -> {
			int p=1;
			
			while(y>0) {
				
				p=p*x;
				y--;
			}
			return p;
		};
		int a=3;
		int b=4;
		result=op.perform(a, b);
		System.out.println(a+" Power "+b+" is: "+result);

	}

}
