package com.logical;

import java.util.Scanner;

// Greatest Common Divisor or HCF (Highest Common factor)
//eg. 8 & 12 then 8 factors is 1,2,4,8 and 12 factors is 1,2,3,4,6,12 hence GCD is 4
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	}

}
