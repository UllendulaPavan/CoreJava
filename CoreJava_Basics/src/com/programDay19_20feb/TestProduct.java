package com.programDay19_20feb;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("how many Product objects want to create:");
		int noProducts=sc.nextInt();
		
		for(int i=0;i<noProducts;i++) {
			Product result=Product.createProduct();
			System.out.println(result);
		}

	}

}
