package com.Array;

public class CopyArray {

	public static void main(String[] args) {

		char[] ch1 = { 'J', 'A', 'V', 'A' };
		int size = ch1.length;
		char[] ch2 = new char[size]; // Declaring new array without initialization
		for (int i = 0; i < ch1.length; i++) {
			ch2[i] = ch1[i];
		}
		System.out.println("Original Array");
		for (char c1 : ch1) { // Original Array
			System.out.print(c1 + ",");
		}
		System.out.println("\n" + "Copy Array");
		for (char c2 : ch2) { // Copy Array
			System.out.print(c2 + ",");
		}

	}

}
