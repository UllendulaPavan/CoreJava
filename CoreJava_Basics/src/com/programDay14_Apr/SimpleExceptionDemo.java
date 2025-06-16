package com.programDay14_Apr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
	public static void main (String [] args) {
		
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int a=sc.nextInt();
			System.out.println("Enter the second number:");
			int b=sc.nextInt();
			
			System.out.println("Enter the first integer (a): "+a);
			System.out.println("Enter the second integer (b):"+b);
		}
		catch(InputMismatchException e) {
			System.out.println("An InputMismatchException occurred.");
			System.out.println("Message: null----");
			
			  System.out.println("String representation:"+e.getMessage());
			System.out.println("----"+e.toString());
			
			System.out.println("Stack trace:");
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
