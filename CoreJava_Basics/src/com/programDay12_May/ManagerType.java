package com.programDay12_May;

public enum ManagerType {
    HR,SALES
}
class Manager extends Employee{
	private  ManagerType manager ;
	
	public Manager() {
		
	}
	

	public Manager(String name, int employeeId, double salary, ManagerType manager) {
		super(name, employeeId, salary);
		this.manager = manager;
	}

	public ManagerType getManager() {
		return manager;
	}


	public void setManager(ManagerType manager) {
		this.manager = manager;
	}


	@Override
	public void setSalary(double salary) {
		if(manager==ManagerType.HR) {
			super.setSalary(getSalary()+10000);
		}
		else {
			super.setSalary(getSalary()+5000);
		}
	}
	
}