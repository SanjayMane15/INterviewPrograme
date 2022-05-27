package com.ConversionProgramme;

import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) {
		String s="Hello";
		// By using charAt();
		char c=s.charAt(2); // pass any index in it.
		System.out.println(c);
		
		// By using toCharArray();
		
		char [] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
	}

}
