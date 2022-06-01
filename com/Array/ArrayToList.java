package com.Array;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		String[] s = { "S", "A", "N", "J", "A", "Y" };

		System.out.println("Array : " + Arrays.toString(s)); // Print Array

		List<String> list = Arrays.asList(s);
		System.out.println("List : " + list); //

	}

}
