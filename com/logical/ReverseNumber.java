package com.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int rem = 0;
		int reverse = 0;
		while(number!=0) {
			rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		System.out.println("Reverse Number is : "+reverse);
		
	}
	
	
}
