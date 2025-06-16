package com.programDay16_17feb;

import java.util.Scanner;

public class RoundedSum {
	
	public int roundToNearestTen(int number) {
		int reminder=number%10;
		if(reminder>=5) {
			return number +(10-reminder);
		}else {
			return number-reminder;
		}
	}
	
	public int sumOfRoundedValues(int number1,int number2,int number3) {
		int roundNumber1=roundToNearestTen(number1);
		int roundNumber2=roundToNearestTen(number2);
		int roundNumber3=roundToNearestTen(number3);
		 return roundNumber1+roundNumber2+roundNumber3;
		}

	public static void main(String[] args) {
		System.out.println("Enter three number:");
		Scanner sc =new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
		RoundedSum round =new RoundedSum();
		int result=round.sumOfRoundedValues(number1,number2,number3);
		
		System.out.println("A= "+number1+" b= "+number2+" c= "+number3+" sum of round :"+result);
		
	}

}
