package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Apple");
		al.add("Mango");
		al.add("Banana");
		al.add("Grapes");

		System.out.println("Normel Insertion Order sorting " + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse Insertion Order : " + al);
		Collections.sort(al);
		System.out.println("Ascending Order : " + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Desending Order : " + al);

	}

}
