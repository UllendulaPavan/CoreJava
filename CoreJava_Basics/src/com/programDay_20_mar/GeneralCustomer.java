package com.programDay_20_mar;

public class GeneralCustomer extends Customer {
   
	public GeneralCustomer(String name) {
		super (name);
	}
	
	@Override
	public void calculateBill(double... prices) {
		
		super.calculateBill(prices);
		
		}

}
