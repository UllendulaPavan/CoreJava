package com.programday29_7mar;

public class ContractEmployee extends Employee {
	
	protected  int contractDuration ;

	public ContractEmployee(int employeeId,String employeeName,Double employeeSalary,int contractDuration) {
		super(employeeId,employeeName,employeeSalary);
		this.contractDuration=contractDuration;
    }
	@Override
	public String toString() {
		return "ContractEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", contractDuration=" + contractDuration + "]";
	}
	
	

}
