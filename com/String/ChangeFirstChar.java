package com.String;

public class ChangeFirstChar {

	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println(str);
		System.out.println(str.replaceFirst("o", "@")); // it change only first 'O' from Hello not from world.
		
		String str2 = "ababab";
		System.out.println(str2);
		System.out.println(str2.replaceFirst("a", "A"));
	}

}
