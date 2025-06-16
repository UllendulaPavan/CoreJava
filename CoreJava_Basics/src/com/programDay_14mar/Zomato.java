package com.programDay_14mar;

public class Zomato {
	
	public static void main(String[] args) {
		
		Order o1=new Order(1, "chicken", 500);
		
		Customer c1=new Customer(101, "pavan", "hyd", o1);
		
		System.out.println(c1);
	
	}

}
