package com.programDay_20_mar;

public class FullTimeEmployee extends Employee {

	protected double salary;

	
	public FullTimeEmployee(double salary,int id,String name) {
		super(id,name);
		if(salary <= 0) {
			System.out.println("Salary can't be negative!!!");
			 System.exit(0);
		}
		else {
			this.salary=salary;
		}
		
	}
	
	public double calculateSalary() {
		return salary;
	}
	
	

}
