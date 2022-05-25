package com.logical;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println("Given Number is Positive Number");
		} else {
			System.out.println("Given Number is Negative Number");
		}

//		System.out.println((number > 0) ? "Positive Number" : "Negative Number");
		sc.close();
	}

}
