package com.logical;

import java.util.Scanner;

public class EvenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fisrt Range");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Range");
		int num2 = sc.nextInt();
		System.out.println("Even number present in Given range are : ");
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
		}

		sc.close();
	}

}
