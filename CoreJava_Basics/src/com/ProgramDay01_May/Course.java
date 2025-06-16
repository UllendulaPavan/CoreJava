package com.ProgramDay01_May;

public class Course {
	private int courseId;
	private String courseName;
	private double corse;
	public Course(int courseId, String courseName, double corse) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.corse = corse;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCorse() {
		return corse;
	}
	public void setCorse(double corse) {
		this.corse = corse;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", corse=" + corse + "]";
	}
	
	
	

}
