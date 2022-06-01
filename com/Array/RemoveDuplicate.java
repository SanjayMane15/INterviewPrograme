package com.Array;

public class RemoveDuplicate {

	public static int removeDuplicates(int[] number, int size) {
//		if (size == 0 || size == 1) {
//			return size;
//		}
		int j = 0;
		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] != number[i + 1]) {
				number[j++] = number[i];
			}
		}
		number[j++] = number[size - 1];

		return j;
	}

	public static void main(String[] args) {

		int[] number = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 6 };
		int size = number.length;
		for (int i = 0; i < size; i++) {
			System.out.print(number[i] + ",");
		}
		size = removeDuplicates(number, size);

		System.out.println("\n");
		for (int i = 0; i < size; i++) {
			System.out.print(number[i] + ",");
		}

	}

}