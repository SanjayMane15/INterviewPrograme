package com.Array;

public class Demo {

	
	public static void main(String[] args) {
		
		int [] number= {10,15,13,19,18,17};
		for (int i = 0; i < number.length; i++) {
			int temp=0;
			for (int j = i+1; j < number.length; j++) {
				if (number[i]<number[j]) {
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
			System.out.print(number[i]+",");
		}
		
	}
	
}
