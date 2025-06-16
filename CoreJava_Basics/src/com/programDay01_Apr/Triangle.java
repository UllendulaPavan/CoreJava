package com.programDay01_Apr;

public class Triangle extends Shape{
	
	double base;
	double height;
	
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
	@Override
	double getArea() {
		return 0.5*base*height;
	}
	
	@Override
	void printDetails() {
		System.out.println("Type = "+getClass().getSimpleName());
		System.out.println("Base="+base);
		System.out.println("Height="+height);
		System.out.println("Area="+getArea());
	}

	

}
