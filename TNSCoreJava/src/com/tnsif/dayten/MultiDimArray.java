package com.tnsif.dayten;

import java.util.Scanner;

public class MultiDimArray {
	
	public static void displayMatrix(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void minMaxOfArray(int a[][],int m, int n) {
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[i].length;j++){
				for(int k=0; k<a.length;k++){
					for(int l=0; l<a[k].length;l++){
						if(a[i][j]<a[k][l]) {
							int temp=a[i][j];
							a[i][j] = a[k][l];
							a[k][l] = temp;
						}
					}
				}
			}
		}
		System.out.println("Max: "+ a[m-1][n-1]);
		System.out.println("Min: "+ a[0][0]);
	}

	public static void main(String[] args) {
		
		int a[][];
		int m,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows and columns : ");
		m=sc.nextInt();
		n=sc.nextInt();
		
		a=new int[m][n];
		System.out.println(a.length);//Array length - Rows in arr[rows][cols]
		
		System.out.println("Enter values in array: ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		displayMatrix(a);
		
		//Jagged Array
		int b[][]= {{12,34}, {11,22,33,44,55}, {500}};
		displayMatrix(b);
		
		minMaxOfArray(a, m, n);
		
		displayMatrix(a);
	}

}
