package com.programDay12_May;

public class Clerk extends Employee {
	int speed;
	int accuracy;
	
	public Clerk() {
		
	}

	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	   
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	@Override
	public void setSalary(double speed) {
		if(speed>70 && accuracy>80) {
			super.setSalary(getSalary()+1000);
		}
	}

}
