package com.programDay_02Apr;

import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Select Product Type:\r\n"
				+ "1. Digital Product\r\n"
				+ "2. Physical Product\r\n"
				+ "");
		
		int choice =sc.nextInt();
		Product p= null;
		if(choice==1) {
			System.out.println("Enter Digital Product Name :");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			System.out.println("Enter Product Price :");
			double price =sc.nextDouble();
			
			System.out.println("Enter Product Category :");
			String Category=sc.nextLine();
			Category=sc.nextLine();
			
			System.out.println("Enter Product License Key :");
			String licenseKey=sc.nextLine();
			
			System.out.println("Digital Product :");
			
			p =new DigitalProduct(name, price, Category, licenseKey);
			System.out.println(p);
			p.applyDiscount(10);
			
			
		}
		else if(choice ==2) {
			System.out.println("Enter Physical Product Name :");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			System.out.println("Enter Product Price :");
			double price =sc.nextDouble();
			
			System.out.println("Enter Product Category :");
			String Category=sc.nextLine();
			Category=sc.nextLine();
			
			System.out.println("Enter Product weight :");
			double weight =sc.nextDouble();
			
			System.out.println("Physical Product:");
			p=new PhysicalProduct(name, price, Category, weight);
			System.out.println(p);
			p.applyDiscount(15);
			
	
		}else {
			System.out.println("invalid option");
		}

	}

}
