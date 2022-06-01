package com.String;

public class CountVowels {

	public static void main(String[] args) {

		String str = "Hello My Name is Sanjay Mane";
		System.out.println(str);
		int countVowels = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'
					|| str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
					|| str.toLowerCase().charAt(i) == 'u') {
				countVowels++;
			}
		}
		System.out.println("Vowels Present in Given String is : " + countVowels);
	}

}
