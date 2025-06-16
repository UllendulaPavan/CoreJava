package com.programDay23_26feb;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the Student Marks:");
		int marks=sc.nextInt();
		
		Student dell=new Student(name, marks);
		
		StudentGrade sgrade= CalculateStudentGrade.CalculateGrade(dell);
		System.out.println(sgrade);

	}

}
