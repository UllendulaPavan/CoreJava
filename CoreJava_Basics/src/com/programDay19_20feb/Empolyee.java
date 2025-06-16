package com.programDay19_20feb;

import java.util.Scanner;

public class Empolyee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeDepartment;
	
	
	public Empolyee(int employeeId, String employeeName, double employeeSalary, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
	}

    public static Empolyee createEmpolyee() {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the employee Id:");
    	int employeeId=sc.nextInt();
    	sc.nextLine();
    	
    	System.out.print("Enter the employeeName:");
    	String employeeName=sc.nextLine();
    	
    	System.out.print("Enter the employee Salary:");
    	double employeeSalary=sc.nextDouble();
    	sc.nextLine();
    	
    	System.out.print("Enter the employee Department:");
    	String employeeDepartment=sc.nextLine();
    	
    	return new Empolyee (employeeId,employeeName,employeeSalary,employeeDepartment);
    	
    }
    
    @Override
	public String toString() {
		return "Empolyee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDepartment=" + employeeDepartment + ", Annual Salary with Bonus="
				+ calculateAnnualSalary() + "]";
	}

	public double calculateAnnualSalary() {
    	double annualSalary=employeeSalary*12;
    	double bonus=0;
    	switch(employeeDepartment.toLowerCase()) {
    	case "sale":
    		bonus=annualSalary*0.10;
   		return annualSalary+bonus;
    	case "engineering":
    		bonus=annualSalary*0.15;
    		return annualSalary+bonus;
    	case "hr":
    		bonus=annualSalary*0.08;
    		return annualSalary+bonus;
    	default :
    		bonus=annualSalary*0.05;
    		return annualSalary+bonus;
    		
    	}
    }


	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.print("how many Employee want create:");
		int nOS = user.nextInt();
		
		for(int i=0;i<nOS;i++) {
			Empolyee data=Empolyee.createEmpolyee();
			System.out.println(data);
			
		}
		

		
				

	}

}
