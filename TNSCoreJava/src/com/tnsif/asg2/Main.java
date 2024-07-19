package com.tnsif.asg2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int selector;
		int hours;
		double costPerHour;
		
		//Using Getters and Setters
		
		Scanner sc = new Scanner(System.in);
		AirIndia ai = new AirIndia();
		KingFisher kf = new KingFisher();
		Indigo in = new Indigo();
		
		System.out.println("Select: \n1 AirIndia \n2 KingFisher \n3 Indigo \nEnter: \n");
		selector = sc.nextInt();
		
		System.out.print("\nEnter Hours: "); hours = sc.nextInt();
		  
		System.out.print("\nEnter costPerHour: "); costPerHour = sc.nextDouble();
		  
		switch(selector) { 
		case 1: 
			ai.setHours(hours);
			ai.setCostPerHour(costPerHour); System.out.printf("\nFlight Fare: %.2f", ai.calculateAmount()); 
			break; 
		case 2: 
			kf.setHours(hours);
			kf.setCostPerHour(costPerHour); System.out.printf("\nFlight Fare: %.2f", kf.calculateAmount()); 
			break; 
		case 3: 
			in.setHours(hours);
			in.setCostPerHour(costPerHour); System.out.printf("\nFlight Fare: %.2f", in.calculateAmount()); 
			break; 
		default: System.out.println("Wrong Choice!!");
		  	break; 
		}
		 
		
		//using parameterized constructor
		
		/*
		 * hours = sc.nextInt(); costPerHour = sc.nextDouble();
		 * 
		 * switch(selector) { case 1: AirIndia ai1=new AirIndia(hours,costPerHour);
		 * System.out.println("\nFlight Fare: " + ai1.calculateAmount()); break; case 2:
		 * KingFisher kf1 = new KingFisher(hours,costPerHour);
		 * System.out.println("\nFlight Fare: " + kf1.calculateAmount()); break; case 3:
		 * Indigo in1 = new Indigo(hours,costPerHour);
		 * System.out.println("\nFlight Fare: " + in1.calculateAmount()); break;
		 * default: System.out.println("Wrong Choice!!"); break; }
		 */
		
		sc.close();
	}

}
