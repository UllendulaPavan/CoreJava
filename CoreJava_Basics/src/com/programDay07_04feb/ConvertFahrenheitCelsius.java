package com.programDay07_04feb;

import java.util.Scanner;

public class ConvertFahrenheitCelsius {

	public static void main(String[] args) {
//		double Celsius= Double.parseDouble(args[0]);
//		double Fahrenheit=Double.parseDouble(args[1]);
//		
//		double result=(Fahrenheit-32)*5/9;
//		double result2=((9*Celsius)/5)+32;
//		
//		System.out.println("Celsius is :"+result);
//		System.out.println("Fahrenheit is :"+result2);
		
		System.out.println("Enter Fahrenheit and Celsius  :");
		Scanner sc=new Scanner(System.in);
	      double Celsius= sc.nextDouble();
	      double Fahrenheit= sc.nextDouble();
	      
	      double result=(Fahrenheit-32)*5/9;
	      double result2=((9*Celsius)/5)+32;
	      
	      System.out.println("Celsius is :"+result);
	      System.out.println("Fahrenheit is :"+result2);
	      

	}

}
