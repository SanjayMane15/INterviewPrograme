package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); // Initialization of ArrayList
		al.add("Sanjay"); // Adding data into List
		al.add("Shraddha");
		al.add("Superman");
		al.add("Wonder-Women");

		System.out.println("Check List is Empty or Not : " + al.isEmpty());
		System.out.println("Length of List is = " + al.size());
		// By using directly
		System.out.println(al);

		// By using for each Loop
		System.out.println("<<By using Advance For Loop>>");
		for (String str : al) {
			System.out.println(str);
		}
		// BY using Iterator();
		System.out.println("<<By Using Iterator()>>");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
