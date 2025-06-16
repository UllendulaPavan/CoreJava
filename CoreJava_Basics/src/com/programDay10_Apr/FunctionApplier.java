package com.programDay10_Apr;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {
	
	public static int applyFunction(int value,Function<Integer,Integer> f) {
		
		return f.apply(value);
		
		
	}

	public static void main(String[] args) {
		
		Function<Integer,Integer>  add= (value)-> value+5;
		Function<Integer,Integer>  multiply= (value)-> value*2;		
		Function<Integer,Integer>  subtract= (value)-> value-3;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int value =sc.nextInt();
		
		System.out.println("Original value:"+value);
		System.out.println("After adding 5:"+applyFunction(value,add));
		System.out.println("After multiplying by 2:"+(applyFunction(value, multiply)));
		System.out.println("After subtracting 3:"+(applyFunction(value, subtract)));
		
	}

}
