package com.String;

public class WordCount {

	public static void main(String[] args) {
		String str = "Hello my name is Sanjay Mane";
		// By using Logic
		int countWord = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				countWord++;
			}
		}
		System.out.println("Word Count is : " + countWord);
		
		// By using Split();
		String [] array=str.split(" ");
		System.out.println("Word Count is : "+array.length);
		
		
		
		
	}

}
