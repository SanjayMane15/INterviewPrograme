package com.String;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println("Original String is : " + str);
		// reverse String by using in built method:
		StringBuffer sf = new StringBuffer(str);
		System.out.println("Reverse String is : " + sf.reverse());

		// Reverse String by using own logic
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String is : " + reverse);

	}

}
