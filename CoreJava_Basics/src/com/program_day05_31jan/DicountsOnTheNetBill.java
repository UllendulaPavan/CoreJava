package com.program_day05_31jan;

public class DicountsOnTheNetBill {

	public static void main(String[] args) {
		double amount=Double.parseDouble(args[0]);
		double discount=0;
	    double dis=0;
		if(amount<5000) {
			dis=5;
			discount=amount*0.5;
		}
		else if(amount>=5000 && amount<10000) {
			dis=10;
			discount=amount*0.10;
		}else if(amount>=10000) {
			dis=15;
			discount=amount*0.15;
		}
		System.out.println("Display Discount % :"+dis);
		System.out.println("Discount Amount :"+discount);
		System.out.println("Amount Payable :"+(amount-discount));
		 
	}
	 
}
