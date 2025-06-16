package com.programDay07_04feb;

 import java.util.Scanner;
 
public class CompoundInterest {

	public static void main(String[] args) {
//		float principle=Float.parseFloat(args[0]);
//		float rate=Float.parseFloat(args[1]);
//		float amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
//		System.out.println(" compound interest for 3 years :"+amount);
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle and rate: ");
		float principle = sc.nextFloat();
		float rate = sc.nextFloat();
		float amount =principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println(" compound interest for 3 years :"+amount);
		sc.close();

	}

}
