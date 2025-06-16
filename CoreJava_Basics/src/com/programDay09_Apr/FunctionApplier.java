package com.programDay09_Apr;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
	    
		Function<String ,Integer> getStringLength= (str)-> str.length();
				
		Function<Integer,Double> divideAndFormat=(div)-> div/2.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		System.out.println("String length of "+name+":"+(getStringLength.apply(name)));
         System.out.println("Result of dividing "+num+" by 2: "+(divideAndFormat.apply(num)));
	}

}
