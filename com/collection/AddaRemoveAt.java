package com.collection;

import java.util.ArrayList;

public class AddaRemoveAt {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.add(3, 25); // adding element at particuler index
		System.out.println(al);
		al.add(0, 1000);
		System.out.println(al);
		// Removing elements from particuler index.
		al.remove(0);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
	}

}
