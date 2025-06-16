package com.programDay28_may;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("1. Add Contact\r\n"
				+ "2. Remove Contact\r\n"
				+ "3. Exit\r\n"
				+ "Enter your choice:\r\n"
				+ "");
		Scanner sc =new Scanner (System.in);
		int choice =Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
			default: System.out.println("invalid option..");
		}
		

	}

}
