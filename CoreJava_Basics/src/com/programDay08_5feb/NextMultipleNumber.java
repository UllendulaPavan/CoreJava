package com.programDay08_5feb;

public class NextMultipleNumber {

	public static void main(String[] args) {
		int num =Integer.parseInt(args[0]);
		if(num<0 && num<=0) {
			System.out.println("the result is :-1");
		}
		else if (num>=0) {
			int result =(num/100+1)*100;
			System.out.println("the result is :"+result);
		}

	}

}
