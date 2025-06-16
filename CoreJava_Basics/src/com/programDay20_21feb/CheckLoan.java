package com.programDay20_21feb;

import java.util.Scanner;

public class CheckLoan {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the principal:");
		double principal=sc.nextDouble();
				
		System.out.println("Enter the interest Rate:");
		double interestRate=sc.nextDouble();
		
		System.out.println("Enter the duratin Months:");
		int durationMonths=sc.nextInt();
		
		Loan bank=new Loan( principal, interestRate, durationMonths);
		
		System.out.println("principal:"+bank.getPrincipal());
		System.out.println("interest Rate:"+bank.getInterestRate());
		System.out.println("duratin Months:"+bank.getDurationMonths());
		System.out.println("montly payment:"+bank.calculateMonthlyPayment());

    
	}

}
