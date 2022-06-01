package com.Array;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		// By using for Loop
		System.out.println("For Loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// By using for Each loop
		System.out.println("For Each Loop");
		for (int elements : arr) {
			System.out.println(elements);
		}

		// By using toString()
		System.out.println("toString()");
		System.out.println(Arrays.toString(arr));

	}

}
