package com.ASCI;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		// character whose ASCII value to be found  
		char ch1 = 'a';  
		char ch2 = 'b';  
		// variable that stores the integer value of the character  
		int asciivalue1 = ch1;  
		int asciivalue2 = ch2;  
		System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
		System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  
		// Variable Direct Stored in integer
		int ch3 =(int) 'A'; // type casting  
		int ch4= 'B';  
		System.out.println("The ASCII value of a is: "+ch3);  
		System.out.println("The ASCII value of b is: "+ch4); 
		//By Using Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=sc.next().charAt(0);
		int value=ch;
		System.out.println(ch+" ASCI Value is : "+value);
		sc.close();
	}

}
