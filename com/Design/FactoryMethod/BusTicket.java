package com.Design.FactoryMethod;

public class BusTicket implements Booking {

	@Override
	public String bookTicket() {

		return "Bus Ticket Price is : 750/-INR";
	}

}
