package com.programDay19_20feb;

import java.util.Scanner;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + ", calculate Total Amount=" + calculateTotalAmount() + "]";
	}
	
	public static Product createProduct() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product Id:");
		int productId=sc.nextInt();
		
		System.out.println("Enter the product Name:");
		String productName=sc.nextLine();
		productName=sc.nextLine();
		
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the Quantity:");
		int quantity=sc.nextInt();
		
		 Product p1=new Product(productId,productName,price,quantity);
		 
		return p1;
	}
	
	public double calculateTotalAmount( ) {
		double total=price*quantity;
		double discount=0;
		
		if(total>1000) {
			discount=total*0.10;
		}
		else if(total>500){
			discount=total*0.05;
		}
		else {
			discount=total*0;
		}
		
		return total-discount;
	}
	
	
	

}
