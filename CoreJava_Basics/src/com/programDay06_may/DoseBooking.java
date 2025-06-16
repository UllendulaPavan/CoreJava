package com.programDay06_may;

public class DoseBooking {
	private boolean booked;

	
	
	public void bookDose() {
		if(true==isDoseBooked()) {
			throw new RuntimeException("Dose already booked.");
		}
		booked=true;
	}
	public boolean isDoseBooked() {
		return booked;
	}
	
	
}
