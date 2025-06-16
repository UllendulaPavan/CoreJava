package com.programDay08_5feb;

public class SumOfDigits {

	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int firstDigit,lastDigit;
		firstDigit=num1%10;
		lastDigit=num1/10;
		int result;
		if(num1>=10 && num1<=99)
		{
		result =firstDigit+lastDigit;
		System.out.println("the result is :"+result);
		}
		else if(num1<0) {
			System.out.println("the result is :-3");
		}
		else if(num1>=99) {
			System.out.println("the result is :-2");
		}
		else if (num1>=0 && num1<=9) {
			System.out.println("the result is :-1");
		}
		

	}

}
