package com.ProgramDay01_May;

public class EducationInstitute { 

	Course course[];
	Offer offer[];
	public EducationInstitute(Course[] course, Offer[] offer) {
		super();
		this.course = course;
		this.offer = offer;
	}
	
	public Course[] getCourses() {
		return course;
	}
	public Offer[] getOffers() {
		return offer;
	}
	
	public void  enrollStudentInCourse(int courseId, String studentName) {
		for(Course courses:this.getCourses()) {
			 if(courseId==courses.getCourseId()) {
				  System.out.println(studentName+"");
			 }
		}
	}
}
