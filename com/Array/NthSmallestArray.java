package com.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestArray {

	public static void main(String[] args) {

		int[] arr = { 10789, 1899, 1456, 2013, 1458, 1254, 1472, 2365, 2165, 2456 };

		Arrays.sort(arr); // Sort the Array First
		System.out.println(Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Highest");
		int smallest = sc.nextInt(); // get Which smallest number
		int index = smallest - 1; // get index value

		System.out.println(smallest + " Smallest Array = " + arr[index]);

	}
}
