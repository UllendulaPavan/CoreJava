package com.programDay23_26feb;

public class Student {
	
	private String name;
	private int marks;
	
	public  Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return  name;
	}
	
	


}
