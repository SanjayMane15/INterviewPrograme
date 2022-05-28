package com.ConversionProgramme;

public class BooleanToString {
	
	public static void main(String[] args) {
		boolean b = true;
		// by using valueOf();
		String s1 = String.valueOf(b);
		System.out.println("String.valueOf() " + s1);
		// By using toString();
		String s2 = Boolean.toString(b);
		System.out.println("toString() " + s2);

	}

}
