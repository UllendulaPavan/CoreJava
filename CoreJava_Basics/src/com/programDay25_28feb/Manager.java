package com.programDay25_28feb;

public class Manager {
	
	int id ;
	String name;
	double basicSalary ;
	double HRAPer ;
	double DAPer;
	double projectAllowance;
	
	public Manager(int id,String name,double basicSalary,double HRAPer,double DAPer,double projectAllowance) {
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
		this. projectAllowance= projectAllowance;
	}
	
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer+projectAllowance;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + "]";
	}

}
