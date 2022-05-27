package com.ConversionProgramme;

public class ObjectToString {

	public static void main(String[] args) {

		ObjectToString obj = new ObjectToString(); // Class Object

		// Object to String - by using toString();
		String s1 = obj.toString();
		System.out.println(s1);

		// Object to String - by using valueOf();
		String s2 = String.valueOf(obj);
		System.out.println(s2);

		// compare created string objects by using equals()

		System.out.println(s1.equals(s2)); // we will get true

	}
}
