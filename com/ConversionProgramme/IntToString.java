package com.ConversionProgramme;

public class IntToString {

	public static void main(String[] args) {
		int i = 1500;
		// by using valueOf();
		String s1 = String.valueOf(i);
		System.out.println("String.valueOf() " + s1);
		// By using toString();
		String s2 = Integer.toString(i);
		System.out.println("toString() " + s2);
		// By using String.formate();
		String s3 = String.format("%d", i);
		System.out.println("String.formate() " + s3);

	}

}
