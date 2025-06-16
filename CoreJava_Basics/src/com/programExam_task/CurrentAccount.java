package com.programExam_task;

public class CurrentAccount extends BankAccount {
	protected double overdraftLimit = 5000.0;
	
	public CurrentAccount(String accountHolderName,String accountNumber,double balance) {
		super(accountHolderName,accountNumber,balance); 
	}
	
	public void calculateInterest() {
		System.err.println("Current accounts do not earn interest.");
		System.out.println("Overdraft limit RS :"+overdraftLimit);
	}

	
	
}
