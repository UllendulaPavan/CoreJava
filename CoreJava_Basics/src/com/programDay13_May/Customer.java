package com.programDay13_May;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter : coldCoffee, BlackCoffee , milkCoffee");
		System.out.println("Enter the Type");
		String type =sc.nextLine();
		
		System.out.println("Enter : Small, Big , medium");
		System.out.println("Enter the Size");
		String size =sc.nextLine();
		
		CoffeeOrder c =new CoffeeOrder(Coffeetypes.valueOf(type), CoffeeSize.valueOf(size));
		System.out.println(c.getOrderDetails());
		
		
	}

}
