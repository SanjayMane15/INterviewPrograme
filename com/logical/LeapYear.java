package com.logical;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			System.out.println("Year is Leap Year");
		} else {
			System.out.println("Year is Not a Leap Year");
		}

		sc.close();
	}

}
