package com.Design.FactoryMethod;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Booking mode");
			String input = sc.nextLine();
			Booking booking = FactoryMethod.createBooking(input);
			System.out.println(booking.bookTicket());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
