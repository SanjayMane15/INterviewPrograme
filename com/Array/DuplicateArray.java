package com.Array;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] number = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9 };
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					System.out.println("Duplicate Elements : " + number[j]);
				}
			}
		}

	}
}
