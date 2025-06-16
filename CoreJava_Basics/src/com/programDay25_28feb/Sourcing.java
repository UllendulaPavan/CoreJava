package com.programDay25_28feb;

public class Sourcing {
	
	

	int id ;
	String name;
	double basicSalary ;
	double HRAPer ;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;

	
	public Sourcing(int id,String name,double basicSalary,double HRAPer,double DAPer,int enrollmentTarget,int enrollmentReached,double perkPerEnrollment) {
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
		this.enrollmentTarget=enrollmentTarget;
		this.enrollmentReached=enrollmentReached;
		this.perkPerEnrollment=perkPerEnrollment;
	}
	
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;


	}

	@Override
	public String toString() {
		return "Sourcing [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached="
				+ enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}

}
