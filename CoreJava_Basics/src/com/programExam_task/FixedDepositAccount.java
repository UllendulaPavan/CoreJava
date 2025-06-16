package com.programExam_task;

public class FixedDepositAccount extends BankAccount{

	protected double interestRate = 6.5;
	protected int depositTerm;
	
	public FixedDepositAccount(String accountHolderName,String accountNumber,double balance, int depositTerm) {
		super(accountHolderName,accountNumber,balance); 
		this.depositTerm=depositTerm;
	 }
	
	public void calculateInterest()
	{
		System.out.print("Fixed Deposit Interest for "+depositTerm+" years RS :"+(balance*depositTerm*interestRate/100));
	}
}