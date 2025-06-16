package com.program_examQuestion_bank;

public class BankCustomerBLC {

	String bankName;
	String bankCustomerName;
	String  bankAddress;
	String bankIFSCCode;
	int customerAccountNumber;
	double currentBalance;
   public void setDeatils(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,int customerAccountNumber,double currentBalance) {
	   this.bankName=bankName;
	   this.bankCustomerName=bankCustomerName;
	   this.bankAddress=bankAddress;
	   this.bankIFSCCode=bankIFSCCode;
	   this.customerAccountNumber=customerAccountNumber;
	   this.currentBalance=currentBalance;
   }
  public void withdraw(double amount) {
	   if(currentBalance <1000) {
		   System.out.println("InsufficientBalance ");
	   }
	   if((currentBalance - amount)<1000) {
		   System.out.println("MinimumBalance");
	   }
	   currentBalance -=amount;
	   System.out.println("Transaction Successful");
	   System.out.println("Available Balance :"+currentBalance);
   }
  public void deposit(double amount) {
	   currentBalance +=amount;
	  System.out.println("Deposited Successfully .");
	  currentBalance();
  }
  public void currentBalance() {
	   System.out.println("Available balance :"+currentBalance);
  }
  public void displayDetails() {
	  System.out.println( "bank Name:"+bankName+"\n"+"Customer Name:"+bankCustomerName+"\n"+"bank Address:"+bankAddress+ "\n" +
              "IFSC Code: " + bankIFSCCode + "\n" +
              "Account Number: " + customerAccountNumber + "\n" +
              "Current Balance: Rs." + currentBalance);
  }
  
	
}
