package com.logical;

import java.util.Scanner;

public class MultiplicationTable_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Range");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Range");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
