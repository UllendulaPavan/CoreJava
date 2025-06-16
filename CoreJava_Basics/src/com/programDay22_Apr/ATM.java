package com.programDay22_Apr;

import java.util.Scanner;

import com.programExam_task.CurrentAccount;

public class ATM {

	public static void main(String[] args) {
	 
		Scanner sc =new Scanner (System.in);
		BankAccount b1 =new BankAccount(123456789,1000);
		BankAccount b2 = new BankAccount(99999999,5000);
		Customer c1 =new Customer("Pavan", b1);
		
		BankAccount currentAccount=b1;
		
		System.out.println("Select an option :\r\n"
				+ "           1. Deposit\r\n"
				+ "           2. Withdraw\r\n"
				+ "           3. Transfer\r\n"
				+ "           4. Loan Application\r\n"
				+ "           5. Check Balance\r\n"
				+ "           6. Exit\r\n"
				+ "");
		System.out.println("Enter your option :");
		int option =sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Enter the deposit amount:");
			double deposit =sc.nextDouble();
			try {
				CurrentAccount.deposit(deposit);
			}
			catch(InvalidAmountException e) {
				
			}
			  break;c
		case 2:
			System.out.println("Enter the deposit amount:");
			double Withdraw =sc.nextDouble();
			try {
				CurrentAccount.withdraw(Withdraw);
			}
			catch(InsufficientFundsException | InvalidAmountException e) {
				
			}
			  break;
		case 3:
			System.out.println("Enter the deposit amount:");
			double Transfer =sc.nextDouble();
			try {
				CurrentAccount.transfer(  , Transfer);
			}
			catch(InsufficientFundsException | AccountNotFoundException | InvalidAmountException e) {
				
			}
			  break;
		case 4:
			System.out.println("Enter the deposit amount:");
			double loanAmount =sc.nextDouble();
			try {
				CurrentAccount.applyForLoan(loanAmount);
			}
			catch(LoanNotAllowedException | InvalidAmountException e) {
				
			}
			  break;
		case 5:System.out.println("Current balance :"+CurrentAccount.getBalance());
			  break;
		case 6:System.out.println("Exit.");
		        break;
		default:System.out.println("invalid option.");
			
		}
       sc.close();
	}

}
