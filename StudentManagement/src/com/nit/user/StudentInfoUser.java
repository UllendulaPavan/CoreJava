package com.nit.user;
import java.rmi.server.Operation;
import java.sql.SQLException;
import java.util.Scanner;
import com.jdbcTask.bean.Student;
import com.jdbcTask.implimentation.Operations;

public class StudentInfoUser {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\u001B[31m" + "Press 1 for Inserting the data");
			System.out.println("\u001B[35m" + "Press 2 for getting the details");
			System.out.println("\u001B[34m" + "Press 3 for exit ");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				   System.out.println("Enter the student name");
				   String name=sc.next();
				   System.out.println("Enter the student id");
				   int id=sc.nextInt();
				   Student s=new Student(name, id);
				   try {
					Operations.insertStudent(s);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   
				break;
			case 2:
				try {
					Operations.fetch();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Thanks for using App");
				System.exit(0);
				break;
				
			default:System.out.println("invalid option..");
				break;
			}
		}
	}
}
