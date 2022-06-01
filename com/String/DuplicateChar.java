package com.String;

public class DuplicateChar {
	
	public static void main(String[] args) {
		String str="Brezez";
		char[]ch=new char[str.length()];
		ch=str.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					System.out.println("Duplicate character is : "+ch[j]);
				}
			}
		}
	
	}

}
