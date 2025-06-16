package com.programDay10_Apr;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator {
	
	public static int generateRandomNumber( int min, int max) {
		Random random=new Random();
		
		
		Supplier<Integer> GRN =()-> {
			int num=random.nextInt(min,max);
			return num;
		};
		return GRN.get();
		
}
	
	public static void main(String [] args) {
		
		
		Scanner sc =new Scanner(System.in);
		 //System.out.println("Enter the number:");
		 System.out.print("Enter the minimum value:");
		int num1=sc.nextInt();
		System.out.print("Enter the maximum value:");
		int num2=sc.nextInt();
		System.out.println("Random number generated:"+generateRandomNumber(num1, num2));
	}
	
	

}
