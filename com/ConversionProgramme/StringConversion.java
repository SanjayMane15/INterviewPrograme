package com.ConversionProgramme;

// String to int,long,float,double and vice-versa
public class StringConversion {

	public static void main(String[] args) {

		String s = "1509";
		// case 1: String to int
		int i = Integer.parseInt(s);
		System.out.println("String to int " + i);
		// case 2: String to long
		long l = Long.parseLong(s);
		System.out.println("String to long " + l);
		// case 3: String to float
		float f = Float.parseFloat(s);
		System.out.println("String to float " + f);
		// case 4: String to double
		double d = Double.parseDouble(s);
		System.out.println("String to double " + d);
		// Case 5 : String to boolean
		String s1="true";
		String s2="false";
		String s3="ok";
		boolean b1=Boolean.parseBoolean(s1);
		System.out.println(b1);
		boolean b2=Boolean.parseBoolean(s2);
		System.out.println(b2);
		boolean b3=Boolean.parseBoolean(s3);
		System.out.println(b3);
	}

}
