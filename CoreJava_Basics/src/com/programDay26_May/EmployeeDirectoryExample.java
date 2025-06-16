package com.programDay26_May;

import java.util.Scanner;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Directory d=new Directory();
		
		
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println(" 1.Adding employee details \n 2.display the employee details \n 3.update the employee details \n 4.delete employee details");
		System.out.println("Enter the choice:");
		int choice =Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the name:");
			String name =sc.nextLine();
			System.out.println("Enter the position:");
			String pos =sc.nextLine();
			System.out.println("Enter the salary:");
			double sal =Double.parseDouble(sc.nextLine());
			Employee emp=new Employee(name, pos, sal);
			d.addEmployee(emp);
			break;
		case 2:
			d.displayAllEmployees();
			break;
		case 3:
			System.out.println("Enter the position of index of update ");
			int index =Integer.parseInt(sc.nextLine());
			d.updateEmployee(index-1);
			break;
		case 4:
			System.out.println("Enter the postion of index of delete");
			int index1 =Integer.parseInt(sc.nextLine());
			d.deleteEmployee(index1-1);
			break;
			default:System.out.println("invalid option");
		}

	}
	}
}
