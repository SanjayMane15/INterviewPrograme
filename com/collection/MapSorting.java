package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MapSorting {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(101, "Sanjay");
		map.put(103, "Shraddha");
		map.put(104, "Manmath");
		map.put(102, "Rajashri");
		System.out.println("<<<<<<<<Before Sorting>>>>>");
		Set<Integer>s=map.keySet();
		Iterator<Integer>itr=s.iterator();
		while(itr.hasNext()) {
			int i=itr.next();
			System.out.println("Key="+i+" Value="+map.get(i));
		}
		
		TreeMap
		System.out.println("<<<<<<<<After Sorting>>>>>");
		Set<Integer>s1=map.keySet();
		Iterator<Integer>itr1=s1.iterator();
		while(itr1.hasNext()) {
			int i=itr1.next();
			System.out.println("Key="+i+" Value="+map.get(i));
		}
		
	}

}
