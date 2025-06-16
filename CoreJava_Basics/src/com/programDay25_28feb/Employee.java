package com.programDay25_28feb;

public class Employee {
	

	int id ;
	String name;
	double basicSalary ;
	double HRAPer ;
	double DAPer;
	
	public Employee(int id,String name,double basicSalary,double HRAPer,double DAPer) {
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
	}
	
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + "]";
	}
	
	


}
