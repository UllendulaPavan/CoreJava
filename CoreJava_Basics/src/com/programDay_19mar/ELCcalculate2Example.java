package com.programDay_19mar;

public class ELCcalculate2Example {
	
	public static void main(String[] args) {
		ShapeCalculator s1 =new ShapeCalculator();
		
		double r=s1.calculateArea(7.0);
		
		System.out.println("Area of circle with radius :"+r);
		
		int i=s1.calculateArea(-5);
		System.out.println("Area of Square:"+i);
		
		int k=s1.calculateArea(-5 , 10);
		System.out.println("Area of rectangle:"+k);
		
	}

}
