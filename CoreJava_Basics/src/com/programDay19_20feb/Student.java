package com.programDay19_20feb;

import java.util.Scanner;

public class Student {

	private String name;
	private int age;
	private String grade;


	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	public static Student createStudent() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name:");
		String name = sc.nextLine();
		
		System.out.print("Enter the Age:");
		int age = sc.nextInt();
		
		
		System.out.print("Enter the grade:");
		String grade = sc.nextLine();
		grade = sc.nextLine();
		

		

		return new Student(name, age, grade);
	}

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);

		System.out.print("how many student want create:");
		int nOS = user.nextInt();

		for (int i = 0; i < nOS; i++) {
			Student newStudent = Student.createStudent();
			System.out.println(newStudent);
			
		}

	}

}
