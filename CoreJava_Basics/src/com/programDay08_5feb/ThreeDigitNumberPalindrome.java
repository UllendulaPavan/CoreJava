package com.programDay08_5feb;

public class ThreeDigitNumberPalindrome {

	public static void main(String[] args) {
		int num =Integer.parseInt(args[0]);
		int result = ThreeDigitNumberPalindrome.palindrome(num);
		
		if(result==1) {
			System.out.println("number is pallindrome :"+num);
		}
		
		else if(result==0) {
			System.out.println("number is not a pallindrome");
		}
		
		else if(result==-1) {
			System.out.println("-ve kindly provide the +ve number only");
		}
		
		else if (result ==-2) {
			System.out.println(" number is not an three digit number");
		}
		
	}
		
	public static int palindrome(int num) {
		int temp=num;
		int revers,reminder=0;
		int count =0;
		while(num!=0) {
			revers=num%10;
			reminder=reminder*10+revers;
			num=num/10;
			count++;
		}
		 if (temp<=0) {
			return -1;
		}
		 else if(temp==reminder) {
			return 1;
		}
		else if (count!=3) {
			return -2;
		}
		
		else {
			return 0;
		}

	}

}
