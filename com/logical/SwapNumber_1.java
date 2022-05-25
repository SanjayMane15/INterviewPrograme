package com.logical;

import java.util.Scanner;

public class SwapNumber_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Number 1: " + num1 + " " + " Number 2: " + num2);
		System.out.println("After Swapping");
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Number 1: " + num1 + " " + " Number 2: " + num2);
		sc.close();
	}

}
