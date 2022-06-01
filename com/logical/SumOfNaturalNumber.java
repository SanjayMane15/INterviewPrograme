package com.logical;

//natural number is 1,2,3,.....infinity.
public class SumOfNaturalNumber {

	public static void main(String[] args) {

		// By using for Loop
		int num1 = 1;
		int num2 = 10;
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("Sum of Natural Number is : " + sum);

		// By using while Loop

		int start = 1;
		int end = 100;
		int total = 0;
		while (start <= end) {
			total += start;
			start++;
		}
		System.out.println("Sum of Natural Number is : " + total);

	}

}
