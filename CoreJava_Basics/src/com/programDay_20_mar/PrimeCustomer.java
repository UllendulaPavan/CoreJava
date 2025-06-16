package com.programDay_20_mar;

public class PrimeCustomer extends Customer {
	
	protected double discountRate=10.0;
	
	public PrimeCustomer(String name) {
		super(name);
	}
	
	@Override
	public void calculateBill(double... prices) {
		
		double totalCost=0;
		for(double price : prices) {
			if(price <0) {
				System.out.println("Item price cannot be negative.");
				System.exit(0);
			}
			else {
				totalCost +=price;
			}
			
			double disount =discountRate *(totalCost/100);
			double finalBill =totalCost-disount;
			
			System.out.println("Welcome to Hyderabad Mall :");
			System.out.println("Customer:"+name);
			System.out.println("Total cost RS :"+totalCost);
			System.out.println("Discount RS :"+disount);
			System.out.println("Final amount RS :"+finalBill);
		}
		
	}


}
