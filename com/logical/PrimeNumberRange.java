package com.logical;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fisrt Range");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Range");
		int num2 = sc.nextInt();

		System.out.println("Prime number present in Given range are : ");
		for (int i = num1; i <= num2; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count <= 2) {
				System.out.print(i + ",");
			}
		}

	}
}
