package com.logical;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		System.out.println("Factors of Given Number are : ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i+",");
			}
		}
		sc.close();
	}
}
