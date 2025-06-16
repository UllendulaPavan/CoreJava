package com.programDay2_May;

public class Chef extends Thread {
	Restaurant restaurant;

	public Chef(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	@Override 
	public void run() {
		restaurant.placeOrder();
	}
}
