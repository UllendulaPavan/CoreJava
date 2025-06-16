package com.programDay16_17feb;

import java.util.Scanner;

public class NextMultipleOfHundred {
	
	public int getNextMultipleOfHundred(int number) {
//		int value= number/100*100;
		return ((number/100)+1)*100;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc =new Scanner(System.in);
		int number= sc.nextInt();
		
		NextMultipleOfHundred mutiply=new NextMultipleOfHundred();
		int result=mutiply.getNextMultipleOfHundred(number);
		System.out.println("Next multiple Number:"+number+" is: "+result);

	}

}
