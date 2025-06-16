package com.programDay_26mar;

public class StudentTester {
	
	public static void main (String[] args) {
		
		Student s=null;
		
		System.out.println("Science Student :=");
		ScienceStudent c =new ScienceStudent("pavan", "sachenthan", 55, 66, 77);
		System.out.println("percentage is :"+c.getPercentage());
		System.out.println("total No Of Students :"+Student.getTotalNoStudents());
		
		System.out.println("===========================================");
		
		System.out.println("History Student :=");
		HistoryStudent c1 =new HistoryStudent("dheeraj", "shiva", 85, 95);
		System.out.println("percentage is :"+c1.getPercentage());
		System.out.println("total No Of Students  :"+Student.getTotalNoStudents());
		
	}
	

}
