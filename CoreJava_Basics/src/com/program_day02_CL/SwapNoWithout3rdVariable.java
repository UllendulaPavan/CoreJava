package com.program_day02_CL;

public class SwapNoWithout3rdVariable {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("before swaping a:"+a+", b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swaping a:"+a+", b:"+b);

	}

}
