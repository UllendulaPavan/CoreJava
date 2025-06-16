package com.programDay13_12Feb;

import java.util.Scanner;

public class EmployeeClass {  
	//instance varible
	int employeeId;
	String employeeName;
	Double employeeSalary;
	
	public void setEmployeeData() {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the employeeId:");
		employeeId=sc.nextInt();
		System.out.print("enter the employeeName:");
		employeeName=sc.nextLine();
		employeeName=sc.nextLine();
		System.out.print("enter the employeeSalary:");
		employeeSalary=sc.nextDouble();
	}
	
	public void getEmployeeDate() {
		System.out.println("employeeId is :"+employeeId);
		System.out.println("employeeName is :"+ employeeName);
		System.out.println("employeeSalary is :"+employeeSalary);
	}

	public static void main(String[] args) {
		EmployeeClass ec=new EmployeeClass();  //no retype and it is constructor
         ec.setEmployeeData();
         ec.getEmployeeDate();
         }

}
