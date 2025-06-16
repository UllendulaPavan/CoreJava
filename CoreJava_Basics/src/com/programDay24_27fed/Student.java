package com.programDay24_27fed;

public class Student {
	
	private int studentId;
	private String studentName;
	private int studentAge;
	
	
	public Student() {
		this.studentId=0;
		this.studentName="unknown";
		this.studentAge=0;
				
	}
	
	public Student(int studentId,String studentName,int studentAge) {
		if(studentId<0) {
			System.out.println("Error: Student ID cannot be negative");
			System.exit(0);
		}else {
			this.studentId=studentId;
		}
		
		if(studentName==null || studentName.isEmpty()) {
			System.out.println("Error: Student name cannot be empty");
			System.exit(0);
		}else {
			this.studentName=studentName;
		}
		this.studentAge=studentAge;
		
	}
	
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studendtId) {
		this.studentId=studentId;
	}
	
	public String getstudenName() {
		return studentName;
	}
	public void setstudenName(String studentName) {
		this.studentName=studentName;
	}

	
	public int getstudentAge() {
		return studentAge;
	}
	public void setstudentAge(int studentAge) {
		this.studentAge=studentAge;
	}
	
	public void showDetails() {
		System.out.println("Student Details: Student ID:"+studentId+", student Name:"+studentName+", student Age:"+studentAge);
		
	}

}
