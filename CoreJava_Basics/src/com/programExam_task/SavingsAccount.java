package com.programExam_task;

public class SavingsAccount  extends BankAccount{

	protected double interestRate = 4.0;
	
	public SavingsAccount(String accountHolderName,String accountNumber,double balance) {
		super(accountHolderName,accountNumber,balance);
		
	}
	public void calculateInterest() {
		System.out.println("Savings Account Interest RS:"+balance*interestRate/100);
	}
	
}
