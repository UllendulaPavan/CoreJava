package com.programDay12_May;

public class EmployeeTester {

	public static void main(String[] args) {
	 Manager hr=new Manager("pavan", 101, 500, ManagerType.HR);
	 hr.setSalary(hr.getSalary());
	 System.out.println("name:"+hr.getName()+"\temployeeId:"+hr.getEmployeeId()+"\tsalary:"+hr.getSalary()+"\tmanager:"+hr.getManager());
	 
	 Manager sales =new Manager("Shiva", 102, 1000, ManagerType.SALES);
	 sales.setSalary(sales.getSalary());
	 System.out.println("name:"+sales.getName()+"\temployeeId:"+sales.getEmployeeId()+"\tsalary:"+sales.getSalary()+"\tmanager:"+sales.getManager());
	 
	 Clerk c =new Clerk("dheeraj", 103, 1500, 100, 90);
	 c.setSalary(c.getSpeed());
	 System.out.println("name:"+c.getName()+"\temployeeId:"+c.getEmployeeId()+"\tsalary:"+c.getSalary()+"\tspeed:"+c.getSpeed()+"\taccuracy:"+c.getAccuracy());
	 
	 c.setSpeed(80);
	 System.out.println("name:"+c.getName()+"\temployeeId:"+c.getEmployeeId()+"\tsalary:"+c.getSalary()+"\tspeed:"+c.getSpeed()+"\taccuracy:"+c.getAccuracy());

	}

}
