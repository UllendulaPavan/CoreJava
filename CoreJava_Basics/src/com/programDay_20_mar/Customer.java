package com.programDay_20_mar;

public class Customer {
	
	protected  String name;
	
	double totalCost;
	double discount;

	public Customer(String name) {
		if(name.isEmpty() || name==null) {
			System.out.println("Customer name cannot be empty.");
		}
		else {
		this.name = name;
		}
	}
	
 public void calculateBill(double... prices) 
 {
	 double bill = 0;
	 for(double price : prices) 
	 {
		 if(price<=0)
		 {
			System.out.println("Item price cannot be negative."); 
			System.exit(0);
		 }
		 else
		 {
			bill+=price; 
		 }
		 
		
 }
	 System.out.println("Welcome to Hyderabad Mall :");
		System.out.println("Customer:"+name);
		System.err.println("Total cost RS :"+bill);
		System.out.println("Discount: No discount for regular customers.");
 }
 
 
	

}
