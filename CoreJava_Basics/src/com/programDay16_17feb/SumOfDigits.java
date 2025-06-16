package com.programDay16_17feb;

import java.util.Scanner;

public class SumOfDigits {
	
	public int TwoDigitsSum(int number) {
		int firstDigit=number/10;
		int lastDigit=number%10;
		return firstDigit+lastDigit;
	}

	public static void main(String[] args) {
		System.out.println("enter the Two Digit number:");
		Scanner sc =new Scanner(System.in);
		int number =sc.nextInt();
		
		SumOfDigits sum=new SumOfDigits();
		int result=sum.TwoDigitsSum(number);
		System.out.println("sum of Digit of "+number+" is: "+result);
		
	}

}
