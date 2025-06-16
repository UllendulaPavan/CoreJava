package com.programDay04_CL;

public class multiplicationTable {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		System.out.println("multiplication Table :"+num);
		for(int i=1;i<=10;i++)
		{
		System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
