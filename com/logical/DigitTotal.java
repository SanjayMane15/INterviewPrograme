package com.logical;

import java.util.Scanner;

public class DigitTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int rem = 0;
		int total = 0;
		while(number!=0) {
			rem=number%10;
			total=total+rem;
			number=number/10;
		}
		System.out.println("Reverse Number is : "+total);
		
	}
}
