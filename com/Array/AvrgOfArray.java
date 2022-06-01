package com.Array;

public class AvrgOfArray {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}

		System.out.println("Sum of Array is : " + sum);
		double avrg = sum / number.length;
		System.out.println("Average of an Array : " + avrg);
	}
}
