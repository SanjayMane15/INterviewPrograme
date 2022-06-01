package com.String;

import java.util.StringJoiner;

public class JoinMultString {

	
	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner(","); // Delimiter
		sj.add("J"); // add method to add or join multiples string
		sj.add("A");
		sj.add("V");
		sj.add("A");
		System.out.println(sj);
		
		
	}
}
