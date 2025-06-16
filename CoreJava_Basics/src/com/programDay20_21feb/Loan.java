package com.programDay20_21feb;

public class Loan {

	private double principal;
	private double interestRate;
	private int duratinMonths;
	public Loan(double principal, double interestRate, int duratinMonths) {
		
		if(principal<0|| interestRate<0 || duratinMonths<0) {
			System.out.println("Error");
		}
		
		this.principal = principal;
		this.interestRate = interestRate;
		this.duratinMonths = duratinMonths;
	
	}
	
	public double calculateMonthlyPayment() {
		
		double monthyInterestRate=(interestRate/100)/12;
		double power= Math.pow(1+monthyInterestRate, duratinMonths);
		double numertor =principal*monthyInterestRate*power;
		double denomintor=power-1;
		
		return numertor/denomintor;
		
	}
	public double getPrincipal() {
		return principal;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getDurationMonths(){
		return duratinMonths;
	}
}
