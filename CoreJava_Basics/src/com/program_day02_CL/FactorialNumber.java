package com.program_day02_CL;

public class FactorialNumber {

	public static void main(String[] args) {
		int num= Integer.parseInt(args[0]);
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact *= i;
		}
		
		System.out.println("factorial is :"+fact);
	}

}
