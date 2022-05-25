package com.logical;

public class RandomNumber {

	public static void main(String[] args) {
		// By using Method
		System.out.println("1st Random Number " + Math.random());
		System.out.println("2nd Random Number " + Math.random());
		System.out.println("3rd Random Number " + Math.random());
		System.out.println("4th Random Number " + Math.random());

		// By using Class
		int min = 200;
		int max = 400;
		double a = Math.random() * (max - min + 1) + min;
		System.out.println("Random Number between 200 and 400 " + a);
		int b = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Random Number between 200 and 400 " + b);

	}

}
