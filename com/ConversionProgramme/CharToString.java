package com.ConversionProgramme;

public class CharToString {

	public static void main(String[] args) {

		char ch = 'S';
		// char to String - by using valueOf();
		String s1 = String.valueOf(ch);
		System.out.println(s1);

		// char to String by using toString();

		String s2 = Character.toString(ch);
		System.out.println(s2);

	}
}
