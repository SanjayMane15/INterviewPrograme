package com.collection;
import java.util.*;
public class IterateMap {

	public static void main(String[] args) {

		HashMap<Integer,String>map=new HashMap<Integer,String>(); // Initialization of Map
		map.put(1, "Sanjay"); // Adding the data into Map
		map.put(2, "Shraddha");
		map.put(3, "Manmath");
		System.out.println("Check Map is Empty or Not : "+map.isEmpty());
		System.out.println("Length of Map is = "+map.size());
		System.out.println(map);
		System.out.println("<<By using Iterator()>>");
		Set<Integer>str=map.keySet();
		Iterator<Integer>itr=str.iterator();
		while(itr.hasNext()) {
			int i=itr.next();
			System.out.println("Key="+i+"<<>>"+"Value="+map.get(i));
		}
		
		System.out.println("<<By using for Each loop>>");
		Set<Integer>str1=map.keySet();
		for(Integer i:str1) {
			System.out.println("Key="+i+"<<>>"+"Value="+map.get(i));
		}
		
		System.out.println("<<By using java8 forEach Method>>");
		map.forEach((k,v)->{System.out.println("Key= "+k+" Value= "+v);});
		
	}

}
