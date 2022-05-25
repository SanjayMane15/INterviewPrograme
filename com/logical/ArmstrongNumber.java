package com.logical;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int rem = 0;
		int result = 0;
		int temp = number;
		while (number != 0) {
			rem = number % 10;
			result = result + (rem * rem * rem);
			number = number / 10;
		}
		if (temp == result) {
			System.out.println("The Given Number is Armstrong Number");
		} else {
			System.out.println("The Given Number is not an Armstrong Number");
		}

	}

}
