package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class IterateSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>(); // Initialization of Set
		hs.add(15); // Adding the data into Set
		hs.add(7);
		hs.add(21);
		hs.add(12);
		System.out.println("Check Set is Empty or Not : "+hs.isEmpty());
		System.out.println("Length of Set is = "+hs.size());
		System.out.println(hs);
		System.out.println("<< By using Advance For Loop>>");
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		System.out.println("<<By using Iterator>>");
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
