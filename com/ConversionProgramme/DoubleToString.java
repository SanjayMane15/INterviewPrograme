package com.ConversionProgramme;

public class DoubleToString {

	public static void main(String[] args) {
		double d = 1.71;
		// by using valueOf();
		String s1 = String.valueOf(d);
		System.out.println("String.valueOf() " + s1);
		// By using toString();
		String s2 = Double.toString(d);
		System.out.println("toString() " + s2);

	}

}
