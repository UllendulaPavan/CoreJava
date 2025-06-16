package com.programDay_25mar;

import java.util.Scanner;

public class PaymentProcessing {

	public static void main(String[] args) {
		
//	Scanner sc =new Scanner(System.in);
//	System.out.println("Well come to Naresh IT Bank");
//	System.out.println("=============================");
//	System.out.println("1.Credit Card Payment");
//	System.out.println("2.Debit Card Payment");
//	System.out.println("3.UPI Payment");
//	System.out.print("Enter the Option:");
//	   int num =sc.nextInt();
//	   switch(num) {
//	   case 1:
//		   System.out.println("Thanks for chosing Credit Card Payment");
//		   paymentGateway(new CreditCardPayment());
//		   break;
//	   case 2:
//		   System.out.println("Thanks for chosing Debit Card Payment");
//		   paymentGateway(new DebitCardPayment());
//		   break;
//	   case 3:
//		   System.out.println("thanks for chosing UPI payment");
//		   paymentGateway(new UPIPayment());
//		   break;
//		   default: System.out.println("invalid option");
//	   }
//		
		paymentGateway(new CreditCardPayment(),new DebitCardPayment(),new UPIPayment());
		
	}
	
public static void paymentGateway(Payment... payment) {
			for(Payment r : payment){
				r.processPayment();
		
			}
			
		}

	

}
