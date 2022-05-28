package com.Design.FactoryMethod;

public class FlightTicket implements Booking {

	@Override
	public String bookTicket() {

		return "Flight Ticket Price is : 4750/-INR";
	}

}
