package com.programDay_26mar;

public abstract class Student {

	protected String studentName;
	protected String studentClass;
	
	public static int totalNoOfStudents;
	
	public abstract int getPercentage() ;
		
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
		
	}
	
	
	public Student(String studentName,String studentClass) {
		this.studentName=studentName;
		this.studentClass=studentClass;
		totalNoOfStudents++;
	}
	
	
}
