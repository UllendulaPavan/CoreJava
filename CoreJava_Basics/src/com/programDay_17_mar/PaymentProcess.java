package com.programDay_17_mar;

import java.util.Scanner;

public class PaymentProcess {

	public static void main(String[] args) {
		System.out.println("Payment Menu");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");
		
		System.out.print("Please enter your Payment choice [1/2/3]:");
		
		Payment p1=new Payment();
		
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter the amount you want to pay through cash :");
			int amountt =sc.nextInt();
			p1.makePayment(amountt);
			
			break;
		case 2:
			System.out.println(" Enter your name :");
			String cardHolderName=sc.nextLine();
			cardHolderName=sc.nextLine();
			
			System.out.println("Enter your 16 digit Credit Card Number :");
			String debitCardNumber=sc.nextLine();
			
			System.out.println("Enter your Payment Amount :");
			double amount =sc.nextDouble();
			
			p1.makePayment(cardHolderName, debitCardNumber, amount);
			break;
		case 3:
			System.out.println("Enter your 16 digit Debit Card Number :");
			String CardNumber =sc.nextLine();
			CardNumber =sc.nextLine();
			
			System.out.println(" Enter your Payment Amount :");
			double amoun=sc.nextDouble();
			
			p1.makePayment(CardNumber, amoun);
			
			break;
		}

	}

}
