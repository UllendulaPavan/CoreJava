package com.programDay03_CL;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int rev=0;
		int temp=num;
		while(num!=0) 
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(rev==temp)
		{
			System.out.println("it is palindrome number :"+rev);
		}
		else {
			System.out.println("it is not palindrome number :"+rev);
		}
		

	}

}
