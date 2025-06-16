package com.programDay01_Apr;

public class Rectangle extends Shape {
     
	double length;
	double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	double getArea() {
		
		return length*breadth;
	}
	
	@Override
	void  printDetails() {
		System.out.println("Type = "+getClass().getSimpleName());
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
		System.out.println("Area="+getArea());
	}
	
	
	
	
}
