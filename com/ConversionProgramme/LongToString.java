package com.ConversionProgramme;

public class LongToString {

	public static void main(String[] args) {
		long l = 1994;
		// by using valueOf();
		String s1 = String.valueOf(l);
		System.out.println("String.valueOf() " + s1);
		// By using toString();
		String s2 = Long.toString(l);
		System.out.println("toString() " + s2);
		// By using String.formate();
		String s3 = String.format("%d", l);
		System.out.println("String.formate() " + s3);

	}
}
