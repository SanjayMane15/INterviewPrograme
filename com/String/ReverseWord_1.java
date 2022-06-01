package com.String;

// Reverse String with Normal Sequence
public class ReverseWord_1 {
	
	public static void main(String[] args) {
		
		String str="My Name is Sanjay Mane";
		String [] arr=str.split(" ");
		String reverse="";
		for (int i =arr.length-1;i>=0 ;i--) {
			reverse=reverse.concat(" ")+arr[i];
		}
		System.out.println("Reverse Word : "+reverse);
	}
	

}
