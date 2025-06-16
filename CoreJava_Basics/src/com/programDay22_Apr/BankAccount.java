package com.programDay22_Apr;

public abstract class BankAccount implements Bank{
	 private long accountNumber; 
	 private double balance;
	 
	 public BankAccount (long accountNumber,double balance) {
		 this.accountNumber=accountNumber;
		 this.balance=balance;
	 }
	 
	 @Override
	 public void deposit(double amount) throws InvalidAmountException{
		 if(amount <=0) {
			 throw new InvalidAmountException("Amount must be postive number.");
		 }
		 balance+=amount;
		 System.out.println("Withdraw "+amount+" from account balance of "+balance+"");
		 System.out.println("Balance should decrease by"+balance);
	 }
   
	 @Override
	 public void withdraw(double amount) throws InsufficientFundsException,InvalidAmountException{
		 if(amount <=0) {
			 throw new InvalidAmountException("Amount must be postive number.");
		 }
		 if(amount>balance) {
			 throw new InsufficientFundsException("Transfer "+amount+" from one account to another with sufficient balance.");
		 }
		 balance -=balance;
		 System.out.println(" Withdraw "+amount+" from account balance of "+balance+"."); 
		 System.out.println("Balance should decrease by "+balance+".");
	 }
	 
	 @Override
	 public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException,AccountNotFoundException,InvalidAmountException{
		 if(amount>balance) {
			 throw new InsufficientFundsException("Transfer "+amount+" from one account to another with sufficient balance.");
		 }
		 if(toAccount == null) {
			 throw new AccountNotFoundException("your Account is not found.");
		 }
		 if(amount <=0) {
			 throw new InvalidAmountException("Amount must be postive number.");
		 }
		 this.balance -=amount;
		 toAccount.balance += amount;
		 System.out.println("Sender's balance should decrease by "+amount+", receiver's balance should increase by "+toAccount.accountNumber+".");
		 System.out.println("Attempt to transfer "+amount+" from account with balance "+balance+".");
	 }
	 
	 @Override
	 public void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException{
		 if(amount <=0) {
			 throw new InvalidAmountException("Amount must be postive number.");
		 }
		 if(amount >50000) {
			 System.out.println("Apply for a loan of "+amount+" with account balance greater than 50000.");
		 }
		 if(amount <50000) {
			 System.out.println("Loan should be approved, balance should increase by "+amount+".");
		 }
		 balance +=amount;
		 System.out.println("Loan should be approved, balance should increase by "+balance+".");
	 }
	 
	 @Override
	 public double getBalance() {
		 return balance;
	 }
	 
	 public long getAcountAccount() {
		 return accountNumber;
	 }
	 
	 
} 
	 
	 
	 
	 
	 
	 
	 
	 
	 

