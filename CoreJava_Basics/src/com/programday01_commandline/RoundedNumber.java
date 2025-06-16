package com.programday01_commandline;

import java.util.Scanner;
public class RoundedNumber {

	public static void main(String[] args) {
		
		Scanner scr =new Scanner(System.in);
		System.out.println("enter number:");
		int num = scr.nextInt();
		int lastNumber=num%10;
		int roundNumber;
		if(lastNumber<5)
		{
			roundNumber = num-lastNumber;
		}
		else 
		{
			roundNumber = num+(10-lastNumber);
		}
       
		System.out.println("Rounded number :"+roundNumber);
	}

}
