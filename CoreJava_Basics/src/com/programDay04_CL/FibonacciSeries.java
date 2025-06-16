package com.programDay04_CL;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int first=0;
		int second=1;
		int next;
		for(int i=1;i<=num;i++)
		{
			System.out.println(""+first);
			next=first+second;
			first=second;
			second=next;
		}

	}

}
