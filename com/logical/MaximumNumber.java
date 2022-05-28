package com.logical;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int x = sc.nextInt();
		System.out.println("Enter Second Number");
		int y = sc.nextInt();
		System.out.println("Enter Third Number");
		int z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println("Maximum Number is : " + x);
		} else if (y > x && y > z) {
			System.out.println("Maximum Number is : " + y);
		} else if (z > x && z > y) {
			System.out.println("Maximum Number is : " + z);
		}

	}

}
