package com.programDay_17_mar;

public class Payment {
	
	public  void makePayment(double amount) 
	{
	   if(validateAmount(amount)) {
		   System.out.println("Processing payment via Cash...");
		   System.out.println("Amount Paid RS :"+amount);
		   System.out.println("Payment Successful! ");
		   
	   }

	}
    
	public void makePayment(String cardHolderName, String creditCardNumber,double amount) 
	{
		if(validateCardNumber(creditCardNumber) && validateAmount(amount)) {
			System.out.println("Processing payment via Credit Card...");
			System.out.println("Card Holder:"+cardHolderName);
			System.out.println(" Card Number:"+creditCardNumber);
			System.out.println("Amount Paid RS :"+amount);
			System.out.println("Payment Successful!");
		}
	}
 
	public void makePayment(String debitCardNumber, double amount) 
	{
		if(validateCardNumber(debitCardNumber) && validateAmount(amount)) {
		System.out.println("Processing payment via Debit Card...");
		System.out.println(" Card Number:"+maskCardNumber(debitCardNumber));
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		}
	}
 
    private boolean validateAmount(double amount)
    {
    	if(amount<=0) {
    		System.out.println(" Error: Amount must be greater than zero.");
    		return false;
    	}
		else {
			return true;
		}
    }
    
    

    private boolean validateCardNumber(String debitCardNumber)
    {
    	if(!(debitCardNumber.length()==16)) {
    		System.out.println("Error: Invalid card number. It must be 16 digits.");
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
    private String maskCardNumber(String debitCardNumber) {
    	 
    	return "*-*-**-"+debitCardNumber.substring(12);
    	
    	
    }
    
}
