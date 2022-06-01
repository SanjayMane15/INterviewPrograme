package com.collection;

import java.util.HashSet;

public class SetIntoArray {
	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>(); 
		hs.add(15);
		hs.add(7);
		hs.add(21);
		hs.add(12);
		System.out.println("HashSet : "+hs);
		System.out.println("<<HashSet into Array>>");
		Object[]arr=hs.toArray();
		for (Object object : arr) {
			System.out.println(" Array : "+object);
		}
	}

}
