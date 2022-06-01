package com.String;

public class CountNumber {

	public static void main(String[] args) {
		String str = "My mobile number is 7208744829 and My salary is 90k";
		System.out.println(str);
		int countNumbers = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				countNumbers++;
			}
		}
		System.out.println("Numbers present in Given String is : " + countNumbers);
	}

}
