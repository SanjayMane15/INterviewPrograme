package com.Array;

public class MinimumArray {
	public static void main(String[] args) {
		int number[] = { 15, 17, 25, 16, 29, 14, 15 };
		int min = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("Minimum Array is : " + min);
	}

}
