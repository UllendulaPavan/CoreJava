package com.programday29_7mar;

import java.util.*;

public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter the employee Id:");
		int employeeId =sc.nextInt() ;
		sc.nextLine();
		if(employeeId<0) {
			System.out.println("Invalid Employee Id");
			System.exit(0);
		}
		
		System.out.println("enter the employee name:");
		String employeeName =sc.nextLine();
		if(employeeName.isEmpty() || employeeName==null ) {
			System.out.println("Employee Name can't be null");
			System.exit(0);
		}
		
		System.out.println("enter the employee Salaray:");
	    double employeeSalary =sc.nextDouble();
	    if(employeeSalary<0) {
	    	System.out.println("Salary can't be 0 or negative");
	    	System.exit(0);
	    }
	    
	    System.out.println("Enter the contract duration:");
	     int contractDuration=sc.nextInt();
	     if(contractDuration<0) {
	    	 System.out.println("contract duration is not negative");
	    	 System.exit(0);
	     }
	    
	    PermanentEmployee p1=new PermanentEmployee(employeeId, employeeName, employeeSalary);
	    System.out.println(p1);
	    
	    ContractEmployee c1=new ContractEmployee(employeeId, employeeName, employeeSalary, contractDuration);
	    System.out.println(c1);

	}

}
