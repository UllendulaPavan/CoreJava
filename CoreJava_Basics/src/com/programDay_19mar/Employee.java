package com.programDay_19mar;

public class Employee {
	
	private double hoursWorked;       
	private double hourlyRate ;       
	private double annualSalary;	  
	private double salesAmount;        
	private int commissionRate; 
	
	public  Employee(double hoursWorked,double hourlyRate) {
		
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		System.out.println("Monthly salary of hourly employee:"+calculateSalary(hoursWorked, hourlyRate));
	}
	
	public Employee(double annualSalary) {
		this.annualSalary=annualSalary;
		System.out.println("Expected Output employee:"+calculateSalary(annualSalary));
	}
	
	public Employee(double salesAmount,int commissionRate) {
		this.salesAmount=salesAmount;
		this.commissionRate=commissionRate;
		System.out.println("Commission of employee:"+calculateSalary(salesAmount, commissionRate));
	}
	 
	 public double calculateSalary() {
		
		 return hourlyRate*hoursWorked;
	 }
	 
	 public double calculateSalary(double annualSalary) {
		 
		 return (annualSalary/12);
	 }
	 
	 public double calculateSalary(double salesAmount, double commissionRate) {
		 return  (salesAmount*commissionRate);
	 }
	 



}
