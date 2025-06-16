package com.programDay_19mar;

public class ELC_MathOperations {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		int i = c1.add(-10,20);
		System.out.println("integer values:"+i);
		double w=c1.add(10.5, 20.3);
		System.out.println("integer double values:"+w);
		int m =c1.multiply(10, 20);
		System.out.println("Multiply integer values:"+m);
		double A=c1.multiply(1.0,2.5);
		System.out.println("Multiply double values:"+A);
		

	}

}
