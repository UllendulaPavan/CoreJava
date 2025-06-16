package com.program_examQuestion_bank;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		BankCustomerBLC bc =new BankCustomerBLC();
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the Bank Name:");
		String bankName =sc.nextLine();
		
		System.out.println("Enter the customer Name:");
		String bankCustomerName =sc.nextLine();
		
		System.out.println("Enter bank Address:");
		String bankAddress =sc.nextLine();
		
		System.out.println("Enter IFSC code:");
		String bankIFSCCode =sc.nextLine();
		
		System.out.println("Enter Account Number:");
		int customerAccountNumber =sc.nextInt();
		
		System.out.println("Enter Current Balance:");
		double currentBalance =sc.nextDouble();
		
//		bc.setDetails(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,int customerAccountNumber,double currentBalance);
//		
		
		while(true) {
			System.out.println("\n choose an option ");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.check Balance");
			System.out.println("4.Display Details");
			System.out.println("5.Exit");
			

	        
			int choice =sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter the amount:");
				double withdrawAmount=sc.nextDouble();
				bc.withdraw(withdrawAmount);
				break;
				
			case 2:
				System.out.println("Enter the amount:");
				double depositAmount =sc.nextDouble();
				bc.deposit(depositAmount);
				break;
				
			case 3:
				bc.currentBalance();
                break;
				
			case 4:
				bc.displayDetails();
                 break;
			
			case 5:
				System.out.println("thankyou for using this bank");
				sc.close();
                return;
               
			default:
				 System.out.println("Invalid option. Please try again.");
				
			}
			
			
		}
//		
//		bc.withdraw();
//		bc.deposit();
//		bc.currentBalance();
//		bc.displayDetails();

	}

}
