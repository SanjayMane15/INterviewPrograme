package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}

		}
		if (count<=2) {
			System.out.println("Given Number is Prime Number");
		} else {
			System.out.println("Given Number is Not Prime Number");
		}
		
		System.out.println();
		sc.close();
	}
}
