package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ElementsExits {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);
		System.out.println(al.contains(15)); // true
		System.out.println(al.contains(30)); // false

		Set<String> set = new HashSet<String>();
		set.add("Superman");
		set.add("Batman");
		set.add("Ironman");
		set.add("Antman");
		System.out.println(set);
		System.out.println(set.contains("Batman")); // true
		System.out.println(set.contains("Hulk")); // false

	}

}
