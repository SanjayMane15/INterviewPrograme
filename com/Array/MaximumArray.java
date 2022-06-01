package com.Array;

public class MaximumArray {

	public static void main(String[] args) {
		int number[] = { 15, 17, 25, 16, 29, 14, 15 };
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("Maximum Element is : " + max);
	}
}
