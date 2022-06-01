package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromList {
	
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("Sanjay");
		al.add("Shraddha");
		al.add("Piyu");
		al.add("Sanjay");
		al.add("Shraddha");
		al.add("Piyu");
		System.out.println("Original ArrayList"+al);
		LinkedHashSet<String>lhs=new LinkedHashSet<String>();
		lhs.addAll(al);
		System.out.println("Without The Duplicate : "+lhs);
		
		
	}

}
