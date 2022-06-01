package com.Array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 10789, 2035, 1899, 1456, 2013, 1458 };
		System.out.println("Original Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println("\n" + "Reverse Array : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ",");
		}

	}

}
