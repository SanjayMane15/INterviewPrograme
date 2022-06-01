package com.String;

public class RemoveWhitespaces {
	public static void main(String[] args) {

		String input = "Sanjay Mukundrao Mane";
		System.out.println(input.replace(" ", ""));
		System.out.println(input.replaceAll(" ", ""));

		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z' || input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				result = result + input.charAt(i);
			}
		}
		System.out.println(result);

	}

}
