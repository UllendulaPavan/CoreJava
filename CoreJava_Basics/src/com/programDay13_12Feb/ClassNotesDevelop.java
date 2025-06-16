package com.programDay13_12Feb;

import java.util.Scanner;

public class ClassNotesDevelop {
	
	
	int productId;
	String productName;
	double productPrice;
	
	public void setproductDate() {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the productId:");
		productId=sc.nextInt();
		System.out.println("enter the productName:");
		productName=sc.nextLine();
		productName=sc.nextLine();
		System.out.println("enter the productPrice:");
		productPrice=sc.nextDouble();
		
	}
	
	public void getProductInfo() {
		System.out.println("productId is :"+productId);
		System.out.println("productName is :"+ productName);
		System.out.println("productPrice is :"+productPrice);
	}
	
	

	public static void main(String[] args) {
		
		ClassNotesDevelop cd=new ClassNotesDevelop();
		
		cd.setproductDate();
		cd.getProductInfo();
		

	}

}
