package com.logical;

import java.util.Scanner;

public class FibbonacciSeries {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number=sc.nextInt();
		System.out.println("Fibbonacci Series is : ");
		int num1=0;
		int num2=1;
		System.out.print(num1+","+num2+",");
		int num3=0;
		for (int i = 3; i <=number; i++) {
			num3=num1+num2;
		System.out.print(num3+",");
			num1=num2;
			num2=num3;
		}
		
		
		sc.close();
	}
}
