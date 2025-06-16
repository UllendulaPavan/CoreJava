package com.programDay25_28feb;

public class TaxUtil {
	
	double tax=0.0;
	public double calculateTax(Employee E1) 
	{
		double gross=E1.calculateGrossSalary();
		
		if(gross>30000) {
			  tax=gross*20/100;
		}else {
			tax=gross*5/100;
		}
		return tax;
	}
	
	public double doublecalculateTax(Manager M1) {
      double gross=M1.calculateGrossSalary();
		
		if(gross>30000) {
			  tax=gross*20/100;
		}else {
			tax=gross*5/100;
		}
		return tax;
	}
	public double calculateTax(Trainer T1) {
       double gross=T1.calculateGrossSalary();
		
		if(gross>30000) {
			  tax=gross*20/100;
		}else {
			tax=gross*5/100;
		}
		return tax;
	}
	
	public double calculateTax(Sourcing S1) {
      double gross=S1.calculateGrossSalary();
		
		if(gross>30000) {
			  tax=gross*20/100;
		}else {
			tax=gross*5/100;
		}
		return tax;
	}

}
