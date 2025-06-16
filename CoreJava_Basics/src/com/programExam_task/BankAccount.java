package com.programExam_task;

public class BankAccount {
 
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE="SBIHYD151285";
	
	public BankAccount(String accountHolderName,String accountNumber,double balance) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		if(balance<0) {
			System.out.print("Balance cannot be negative.");
		}
		else {
		this.balance=balance;
		}
	}
	
	public void  calculateInterest()
	{
		System.out.print("Bank interest Calculation");
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account Holder:"+accountHolderName);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance RS:"+balance);
		System.out.println("IFSC CODE:"+IFSC_CODE);
	}
	
	}
