package com.programDay09_Apr;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args) {
		
		Consumer<String> stringConsumer = (str)->System.out.println(str.toUpperCase());
				
		Consumer<Integer> integerConsumer= (num)-> System.out.println(num*num);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=sc.nextLine();
		System.out.println("Enter the Number:");
		int num =sc.nextInt();
		System.out.println("Original string:"+name);
		System.out.println("Original integer:"+num);
		System.out.print("After converting string to uppercase:");
		stringConsumer.accept(name);
		System.out.print("After squaring the integer:");
		integerConsumer.accept(num);

	}

}
