package com.programDay15_Apr;
import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.println("Enter dividend :");
			int dividend =sc.nextInt();
			System.out.println("Enter divisor :");
			int divisor=sc.nextInt();
			
			if(divisor==0) {
				throw new ArithmeticException("Division by zero: dividend="+dividend+", divisor="+divisor);
			}
			int result=performDivision(dividend,divisor);
			System.out.print("Result of division:"+result);
		}
		catch(ArithmeticException e) {
		
			System.out.println("ArithmeticException caught: "+e.getMessage());
			
		}
		sc.close();
	}
	
	public static int performDivision(int dividend,int divisor) {
		return dividend / divisor;
	}
	
	

}
