package com.String;

public class StringIntoArray {

	public static void main(String[] args) {

		String str = "SANJAY";
		// By using logic
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (char c : ch) {
			System.out.println(c); // print character array.
		}

		// By using in uilt Method
		char[] c = str.toCharArray();
		for (char c1 : c) {
			System.out.println(c1); // print character array.
		}

	}

}
