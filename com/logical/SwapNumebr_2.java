package com.logical;

import java.util.Scanner;

public class SwapNumebr_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Number 1: " + num1 + " " + " Number 2: " + num2);
		System.out.println("After Swapping");
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("Number 1: " + num1 + " " + " Number 2: " + num2);

		sc.close();
	}

}
