package com.programDay_20_mar;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("***Salary Calculation Menu** \r\n"
				+ "		 1) FullTime Employees \r\n"
				+ "		 2) PartTime Employees  ");
		
		System.out.print("Please select the Employee type");
		int ch =sc.nextInt();
		
		if(ch ==1) {
			System.out.print("Enter Fulltime Employee Id :");
			int Id=sc.nextInt();
			
			System.out.print("Enter Fulltime Employee Name :");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			System.out.print("Enter the Salary :");
			double salary=sc.nextDouble();
			
			FullTimeEmployee f1 = new FullTimeEmployee(salary, Id, name);
			System.out.println(f1.name+"Salary is:"+f1.calculateSalary());
			
			
		}
		
		if(ch==2) {
			System.out.print("Enter Fulltime Employee Id :");
			int Id=sc.nextInt();
			
			System.out.print("Enter Fulltime Employee Name :");
			String name=sc.nextLine();
			name=sc.nextLine();
			
			System.out.print("Enter your hourly rate:");
			double hourly=sc.nextDouble();
			
			System.out.print("Enter your total works hour in the month :");
			int works=sc.nextInt();
			
			PartTimeEmployee p1 =new PartTimeEmployee(Id, name, hourly, works);
			System.out.println(p1.name+"Salary is :"+p1.calculateSalary());
			
//			
			
			
		}
		
		
		

	}

}
