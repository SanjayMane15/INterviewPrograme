package com.Array;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {

		int[] arr = { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		// By using in Built Method
		System.out.println("\n" + "Descending Order Array");
		Arrays.sort(arr); // Sort the array it means we will get ascending order of Array
		for (int i = arr.length-1;i >=0; i--) { // reverse the ascending order
			System.out.print(arr[i]+",");
		}
		
		// By using logic 
		System.out.println("\n" + "Descending Order Array");
		for (int i = 0; i < arr.length; i++) {
			int temp=0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+",");
		}

	}
}

