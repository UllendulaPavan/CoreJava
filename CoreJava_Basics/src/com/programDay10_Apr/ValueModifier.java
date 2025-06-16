package com.programDay10_Apr;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {
	
	public static void modifyValue(int value, Consumer<Integer> c) {
		c.accept(value);
	}

	public static void main(String[] args) {
		
		Consumer<Integer> doubleValue =(value)-> System.out.println("After doubling the value:"+(value+value));
		Consumer<Integer> incrementBy =(value)-> System.out.println("After incrementing the value by 3:"+(value+3));
	    Consumer<Integer> squareValue =(value)-> System.out.println("After squaring the value:"+(value*value));
	    
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the number");
	    int value =sc.nextInt();
	    System.out.println("Original value:"+value);
	    
	    modifyValue(value,doubleValue);
	    modifyValue(value,incrementBy);
	    modifyValue(value,squareValue);
	}

}
