package com.programDay16_17feb;

import java.util.Scanner;

public class TwoDigitsDifference {
	public int getDiffOfDigits(int number) {
		int firstDigit=number/10;
		int lastDigit=number%10;
		return firstDigit-lastDigit;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Two Digit number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		TwoDigitsDifference sub=new TwoDigitsDifference();
		int result=sub.getDiffOfDigits(number);
		 System.out.println("Difference of digits of " + number + " is: " + result);
	}
}
