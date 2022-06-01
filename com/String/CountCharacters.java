package com.String;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str);
		int countCharacters = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) >= 'a' && str.toLowerCase().charAt(i) <= 'z') {
				countCharacters++;
			}
		}
		System.out.println("Number of Characters is : " + countCharacters);
	}

}
