package com.ConversionProgramme;

public class FloatToString {

	public static void main(String[] args) {
		float f = 15.00f;
		// by using valueOf();
		String s1 = String.valueOf(f);
		System.out.println("String.valueOf() " + s1);
		// By using toString();
		String s2 = Float.toString(f);
		System.out.println("toString() " + s2);

	}

}
