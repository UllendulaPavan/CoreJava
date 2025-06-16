package com.programDay29_may;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester_customer {

	public static void main(String[] args) {
		ArrayList<Customer> al= new ArrayList<Customer>();
		al.add(new Customer(109,"dheeraj",1000D));
		al.add(new Customer(789,"pavan",9000D));
		al.add(new Customer(010,"shiva",7000D));
		al.add(new Customer(999,"sandeep",3000D));
		
		Scanner sc =new Scanner(System.in);
		System.out.println("1. Based on customer number\r\n"
				+ "2. Based on customer name\r\n"
				+ "3. Based on customer bill\r\n"
				+ "");
		System.out.println("Enter the choice:");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Based on customer number");
			al.sort((c1,c2)->c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
			al.forEach(System.out::println);
			break;
		case 2:
			System.out.println("Based on customer name");
			al.sort((c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
			al.forEach(System.out::println);
			break;
		case 3:
			System.out.println("Based on customer bill");
			al.sort((c1,c2)->c1.getCustomerBill().compareTo(c2.getCustomerBill()));
			al.forEach(System.out::println);
			break;
			default : System.out.println("invalid option");
		}
		

	}

}
