package com.Design.FactoryMethod;

public class FactoryMethod {

	public static Booking createBooking(String input) {
		if (input.equalsIgnoreCase("Train")) {
			return new TrainTicket();
		} else if (input.equalsIgnoreCase("Bus")) {
			return new BusTicket();
		} else if (input.equalsIgnoreCase("Flight")) {
			return new FlightTicket();
		} else {
			throw new IllegalArgumentException("Kindly Enter Valid Input");
		}

	}

}
