package com.logical;

import java.util.Scanner;

public class LCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {// (int i = 1; i <= num1 || i <= num2; i++ ) also valid
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of numbers " + num1 + " and " + num2 + " is : " + gcd);
		int lcf = (num1 * num2) / gcd;
		System.out.println("LCF of numbers " + num1 + " and " + num2 + " is : " + lcf);
	}

}
