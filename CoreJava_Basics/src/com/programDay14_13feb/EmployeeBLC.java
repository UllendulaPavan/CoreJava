package com.programDay14_13feb;

public class EmployeeBLC {
	
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	
	public void setEmployeeData(String fname,String lname,int empyid,double sal) {
		firstName=fname;
		lastName=lname;
		employeeId=empyid;
		salary=sal;
		
	}
	public void calculateSalary() {
		if(noOfProject>5 && noOfProject<10) {
			salary+=5000;
		}
		else if(noOfProject>10 && noOfProject<20) {
			salary+=10000;
		}
		else if(noOfProject>20 ) {
			salary+=15000;
		}
		
	}
	public void displayDetails() {
		System.out.println("[ firstName="+firstName+",lastName="+lastName+",employeeId="+employeeId+",salary="+salary+"]");
	}

	
	
}
