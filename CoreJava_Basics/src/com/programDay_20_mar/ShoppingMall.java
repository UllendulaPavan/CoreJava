package com.programDay_20_mar;

import java.util.Scanner;

public class ShoppingMall {
	
	private static String name;
	private static int n;
	private static double[] price;

	public static void generateBill(Customer cust, double... prices) {
		cust.calculateBill(prices);
		
	}

	public static void main(String[] args) {
		
	        System.out.println("Please select the Customer Type to get additional Discount :\r\n"
				+ "        1) General Customer\r\n"
				+ "        2) Prime Customer\r\n"
				+ "        3) VIP Customer");
		
		System.out.print("Please enter Customer type :");
		
		Scanner sc =new Scanner(System.in);
		int input =sc.nextInt();
		
		if(input ==1) {
			System.out.print("Please Enter your Name :");
			String name =sc.nextLine();
			name =sc.nextLine();
			if(name.isEmpty() || name ==" ") {
				System.out.println("Customer name cannot be empty.");
				System.exit(0);
			}
			
			System.out.print("Enter number of Items :");
			int n=sc.nextInt();
			
			System.out.println("Please Enter the Item Name and Price :");
			
			Customer c1=new GeneralCustomer(name);
			double price[]=new double[n];
			for(int i=0;i<n;i++) {
				
				System.out.print((1+i)+")Item Name :");
				String s=sc.nextLine();
				s=sc.nextLine();
				
				System.out.print("Item Price :");
				 double amount=sc.nextDouble();
				 
				if(amount<0) {
					System.out.print("Welcome to Hyderabad Mall :");
					System.out.println("Item price cannot be negative.");
					System.exit(0);
				}
				else {
					price[i] =amount;
				}
				
			}
			c1.calculateBill(price);
	   }
		
       if(input ==2) {
    	   System.out.print("Please Enter your Name :");
			String name =sc.nextLine();
			name =sc.nextLine();
			if(name.isEmpty() || name ==" ") {
				System.out.println("Customer name cannot be empty.");
				System.exit(0);
			}
			
			System.out.print("Enter number of Items :");
			int n=sc.nextInt();
			
			Customer c1=new PrimeCustomer(name);
			System.out.println("Please Enter the Item Name and Price :");
			double price[]=new double[n];
			for(int i=0;i<n;i++) {
				
				System.out.print((1+i)+")Item Name :");
				String s=sc.nextLine();
				s=sc.nextLine();
				
				System.out.print("Item Price :");
				 double amount=sc.nextDouble();
				 
				if(amount<0) {
					System.out.print("Welcome to Hyderabad Mall :");
					System.out.println("Item price cannot be negative.");
					System.exit(0);
				}
				else {
					price[i] =amount;
				}
				
			}
			
			c1.calculateBill(price);
		
      }
       
       if(input ==3) {
    	   System.out.print("Please Enter your Name :");
			String names =sc.nextLine();
			names =sc.nextLine();
			if(names.isEmpty() || names ==" ") {
				System.out.println("Customer name cannot be empty.");
				System.exit(0);
			
			}
			System.out.print("Enter number of Items :");
			int numb=sc.nextInt();
			
			Customer c3=new VIPCustomer(names);
			
			System.out.println("Please Enter the Item Name and Price :");
			double prices[]=new double[numb];
			for(int i=0;i<numb;i++) {
				
				System.out.print((1+i)+")Item Name :");
				String s=sc.nextLine();
				s=sc.nextLine();
				
				System.out.print("Item Price :");
				 double amount=sc.nextDouble();
				 
				if(amount<0) {
					System.out.print("Welcome to Hyderabad Mall :");
					System.out.println("Item price cannot be negative.");
					System.exit(0);
				}
				else {
					prices[i] =amount;
				}
			}
			
			c3.calculateBill(prices);
              

	       
       }

}
}
       
