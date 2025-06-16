package com.programDay14_Apr;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		try(sc) {
			System.out.println("Enter first number : ");
			String num1 = sc.next();
			System.out.println("Enter 2nd number : ");
			String num2 = sc.next();
			
			int x = Integer.parseInt(num1);
			int y = Integer.parseInt(num2);
			if (y == 0) {
				throw new ArithmeticException("Dont pass zero");
			}
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		int z = sc.nextInt();
		System.out.println("Main end");
	}
}
