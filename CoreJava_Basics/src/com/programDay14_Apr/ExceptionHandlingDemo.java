package com.programDay14_Apr;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to convert to an integer:");
		String a=sc.next();
		NullPointerException(a);
		System.out.println("-------------------");
		NumberFormatException(a);

	}
	
	public static void NullPointerException(String s) {
		
		try{
			if(s.toLowerCase().equals("null")) {
				throw new java.lang.NullPointerException();
			}
			System.out.println("Length of the input string:");
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void NumberFormatException(String s) {
		
		try {
			System.out.println("Converted number:");
			System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			e.getLocalizedMessage();
			}
		}

}
