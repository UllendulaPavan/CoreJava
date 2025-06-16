package com.programday29_7mar;

public class PermanentEmployee extends Employee {
	
	protected  double providentfund;

	public PermanentEmployee(int employeeId,String employeeName,Double employeeSalary) {
			super(employeeId,employeeName,employeeSalary);
			this.providentfund=employeeSalary*0.12;
	}
	

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentfund=" + providentfund + "]";
	}
	
	
	public void netSalary() {
		System.out.println(employeeSalary+providentfund);
	}
	

}
