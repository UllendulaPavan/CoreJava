package com.programDay28_may;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

record Student(int id,String name) {
	
}


public class StudentGrade  {

	public static void main(String[] args) {
		
		HashMap<Student, String>  hsp  =new HashMap<Student,String>();
		while(true) {
		System.out.println("1. Add Student Grade\r\n"
				+ "2. Remove Student Grade\r\n"
				+ "3. Exit\r\n"
				+ "Enter your choice:\r\n"
				+ "");
		Scanner sc =new Scanner(System.in);
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Enter Student Id:");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Student name:");
			String name=sc.nextLine();
			System.out.println("Enter student Garde:");
			String grade=sc.nextLine();
			
			Set<Entry<Student, String>> entrySet = hsp.entrySet();
			for ( Entry<Student, String> e : entrySet) {
				Student s = e.getKey();
				if(s.id()!=id){
					hsp.put(new Student(id,name), grade);
				}
				else {
					System.out.println("Id is already there..");
				}
			}
			System.out.println("student grade is add sucessfully..");
			break;
		case 2:
			System.out.println("Enter student id to remove grade:");
			int id1=Integer.parseInt(sc.nextLine());
			System.out.println("Enter student name to remove grade:");
			String name1=sc.nextLine();
			if(hsp.containsKey(new Student(id1,name1))) {
				if(hsp.isEmpty()) {
					System.out.println("Student gade is empty..");
				}
				else {
					hsp.remove(new Student(id1,name1));
					System.out.println("student is removed successfully..");
				}
			}
			
			break;
		case 3:
			System.out.println(hsp);
			System.out.println("thankyou..");
			System.exit(0);
			
			break;
			default: System.out.println("invalid option");
		}

	}
	}
}

