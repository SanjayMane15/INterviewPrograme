package com.Design.FactoryMethod;

public class TrainTicket implements Booking {

	@Override
	public String bookTicket() {

		return "Train Ticket Price is : 450/-INR";
	}

}
