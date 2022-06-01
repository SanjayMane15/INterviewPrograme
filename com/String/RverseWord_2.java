package com.String;
//Reverse Word with Reverse Order
public class RverseWord_2 {

	public static void main(String[] args) {
		String str="My Name is Sanjay Mane";
		String [] arr=str.split("");
		String reverse="";
		for (int i =arr.length-1;i>=0 ;i--) {
			reverse=reverse+arr[i];
		}
		System.out.println("Reverse Word : "+reverse);
	}
	
}
