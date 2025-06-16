package com.programDay_20_mar;

public class VIPCustomer extends Customer{
    
	protected double discountRate = 15.0;
	
	public VIPCustomer(String name) {
		super(name);
		
	}
	
	@Override
	public void  calculateBill(double... prices) {
		double totalCost=0;
		for(double price : prices) {
			if(price < 0) {
				System.out.println("Item price cannot be negative.");
				System.exit(0);
			}
			totalCost+=price;
			}
		
		double discount =discountRate*(totalCost/100);
		double finalBill =totalCost-discount;
		
		System.out.println("Welcome to Hyderabad Mall :");
		System.out.println("Customer:"+name);
		System.out.println("Total cost RS :"+totalCost);
		System.out.println("Discount RS :"+discount);
		System.out.println("Final amount RS :"+finalBill);
		
	}

	
}
