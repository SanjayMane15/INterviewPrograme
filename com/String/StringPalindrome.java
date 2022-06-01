package com.String;

import java.util.Scanner;

//eg : redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		String temp = str;
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = reverse + str.charAt(i);
		}
		if (temp.equalsIgnoreCase(reverse)) {
			System.out.println("String is Palindrom");
		} else {
			System.out.println("String is Not Plalindrome");
		}
	}

}
