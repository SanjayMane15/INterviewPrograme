package com.String;

// Alphabets are 26(5Vowels + 21 Consonants), Excepts Vowels all other alphabets are Consonants.
public class CountConsonants {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str);
		int countConsonants = 0;
		int countVowels = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'
					|| str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
					|| str.toLowerCase().charAt(i) == 'u') {
				countVowels++;
			} else if (str.toLowerCase().charAt(i) >= 'a' && str.toLowerCase().charAt(i) <= 'z') {
				countConsonants++;
			}
		}
		System.out.println("Vowels is : " + countVowels);
		System.out.println("Count Consonants is : " + countConsonants);
	}
}
