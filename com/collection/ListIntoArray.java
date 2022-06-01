package com.collection;

import java.util.ArrayList;

public class ListIntoArray {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Sanjay");
		al.add("Shraddha");
		al.add("Superman");
		al.add("Wonder-Women");
	
		System.out.println("ArrayList"+al);
		System.out.println("<<ArrayList to Array>>");
		Object []arr=al.toArray();
		for (Object object : arr) {
			System.out.println(object);
		}
	}
}
