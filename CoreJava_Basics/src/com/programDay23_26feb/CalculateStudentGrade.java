package com.programDay23_26feb;

public class CalculateStudentGrade {

	
	
	public static StudentGrade CalculateGrade(Student student) {     //FOCTORY METHOD
		if(student.getMarks()>90) {
			 return new StudentGrade(student,'A');
		 }
		else if(student.getMarks()>=75) {
			 return new StudentGrade(student,'B');
		 }
		else if(student.getMarks()>=60) {
			 return new StudentGrade(student,'C');
		 }
		else if(student.getMarks()<60) {
			 return new StudentGrade(student,'D');
		 }
		else
		{
			return new StudentGrade(student,'F');
		}
	}
	
	
}
