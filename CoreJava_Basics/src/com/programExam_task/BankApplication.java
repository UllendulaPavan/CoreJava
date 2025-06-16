package com.programExam_task;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		System.out.println("Please select the Account Type :\r\n"
				+ "        1) Saving Account\r\n"
				+ "        2) Current Account\r\n"
				+ "        3) Fixed Deposit Account\r\n"
				+ "   Please enter the type of account you want to open : [1/2/3]\r\n"
				+ "");
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.print("Enter account Holder Name :");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			System.out.print("Enter account Number :");
			String number=sc.nextLine();
//			number=sc.nextLine();
			
			System.out.print(" Enter the Amount :");
			double amount =sc.nextDouble();
			
			SavingsAccount s1 =new SavingsAccount(name, number, amount);
			s1.displayAccountDetails();
			s1.calculateInterest();
			
			break;
		case 2:
			System.out.print("Enter account Holder Name :");
			String name1=sc.nextLine();
			name1=sc.nextLine();
			
			System.out.print("Enter account Number :");
			String number1=sc.nextLine();
//			number=sc.nextLine();
			
			System.out.print(" Enter the Amount :");
			double amount1 =sc.nextDouble();
			
			CurrentAccount c1 =new CurrentAccount(name1, number1, amount1);
			c1.displayAccountDetails();
			c1.calculateInterest();
			
			break;
		case 3 :
			System.out.print("Enter account Holder Name :");
			String name2=sc.nextLine();
			name=sc.nextLine();
			
			System.out.print("Enter account Number :");
			String number2=sc.nextLine();
//			number=sc.nextLine();
			
			System.out.print(" Enter the Amount :");
			double amount2 =sc.nextDouble();
			
			System.out.print(" How many years you want to deposit");
			int e=sc.nextInt();
			
			FixedDepositAccount f1 = new FixedDepositAccount(name2, number2, amount2, e);
			f1.displayAccountDetails();
			f1.calculateInterest();
			break;
		default:
			System.out.println("invalid option ");
		}
		
	}

}
