package com.Array;

public class MissingArray {

	public static void main(String[] args) {
		int[] number = { 1, 2, 4, 6, 7, 9 };
		for (int i = 1; i < number.length; i++) {
			int count = 0;
			for (int j = 0; j < number.length; j++) {
				if (i == number[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("Missing Element is : " + i);
			}
		}
	}
}
