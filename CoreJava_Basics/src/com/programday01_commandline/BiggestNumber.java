package com.programday01_commandline;

public class BiggestNumber {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int biggest;
		if(a>=b && a>=c) 
		{
			biggest=a;
		}
		else if(b>=a && b>=c) 
		{
			biggest=b;
		}
		else
		{
			biggest=c;
		}
		
		System.out.println("the biggest number :"+biggest);

	}

}
