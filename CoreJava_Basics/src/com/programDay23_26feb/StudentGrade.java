package com.programDay23_26feb;

public class StudentGrade {
    private Student student;//has a relation
    private char studentGrade ;
    
	public StudentGrade(Student student, char studentGrade) 
	{
		super();
		this.student = student;
		this.studentGrade = studentGrade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public char getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(char studentGrade) {
		this.studentGrade = studentGrade;
	}
	@Override
	public String toString() {
		return "[The Student " +student+" has '"+studentGrade+"' Grade]";
	}
	
    
}

