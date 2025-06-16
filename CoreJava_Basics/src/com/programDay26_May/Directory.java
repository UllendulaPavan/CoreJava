package com.programDay26_May;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory {
	
	ArrayList<Employee> al ;
	
	Directory(){
		al=new ArrayList<Employee>();
	}
	
	
	public void addEmployee(Employee e) {
		al.add(e);
	}
	
	public void displayAllEmployees() {
		for (Object e : al) {
			System.out.println(e);
		}
	}
	
	public void updateEmployee(int index) {
		
		Employee emp = al.get(index);
		Scanner sc =new Scanner(System.in);
		System.out.println("1.update name \n 2.update position \n 3.update salary");
		System.out.println("Enter the choice:");
		int choice =Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the name:");
			String name =sc.nextLine();
			 emp.setName(name);
			System.out.println("name is updated");
			
			break;
		case 2:
			System.out.println("Enter the poistion");
			String pos =sc.nextLine();
			 emp.setPosition(pos);
			System.out.println("position is updated");
			
			break;
		case 3:
			System.out.println("Enter the salary");
			double sal =sc.nextDouble();
			 emp.setSalary(sal);
			System.out.println("salary is updated");
			
			break;
			default:System.out.println("invalid option");
		}
		sc.close();
				}
	
	public void deleteEmployee(int index) {
		if(al.size()<index)
		{
			System.out.println("index is not found..");
		}else {
		Employee emp= al.remove(index);
		System.out.println("Removed the name successfully");
		}
	}
	

}
