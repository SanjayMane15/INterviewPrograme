package com.logical;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Given Number is Even Number");
		} else {
			System.out.println("Given number is Odd Number");
		}

//		System.out.println((number%2==0)?"Even Number":"Odd Number");

		sc.close();
	}

}
