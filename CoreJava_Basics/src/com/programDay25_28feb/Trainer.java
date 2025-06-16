package com.programDay25_28feb;

public class Trainer {
	
	
	int id ;
	String name;
	double basicSalary ;
	double HRAPer ;
	double DAPer;
	double batchCount;
	int perkPerBatch;

	
	public Trainer(int id,String name,double basicSalary,double HRAPer,double DAPer,double batchCount,int perkPerBatch) {
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		this.HRAPer=HRAPer;
		this.DAPer=DAPer;
		this. batchCount= batchCount;
		this. perkPerBatch= perkPerBatch;
	}
	
	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer+(batchCount*perkPerBatch);
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + ", batchCount=" + batchCount + ", perkPerBatch=" + perkPerBatch + "]";
	}

}
