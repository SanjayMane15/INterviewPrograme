package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class NthHighestArray {

	public static void main(String[] args) {

		int[] arr = { 10789, 1899, 1456, 2013, 1458, 1254, 1472, 2365, 2165, 2456 };

		Arrays.sort(arr); // Sort the Array First
		System.out.println(Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Highest");
		int highest = sc.nextInt(); // get Which Highest number
		int index = arr.length - highest; // get index value

		System.out.println(highest + " Highest Array = " + arr[index]);

	}
}