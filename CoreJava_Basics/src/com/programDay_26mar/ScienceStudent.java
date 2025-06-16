package com.programDay_26mar;

public class ScienceStudent extends Student {

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	


	public ScienceStudent(String studentName, String studentClass,int physicsMarks,int chemistryMarks,int mathMarks) {
		super(studentName, studentClass);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathMarks;
		
	}


	@Override
	public int getPercentage() {
		return (physicsMarks+chemistryMarks+mathsMarks)/3;
	}
	

}
