package com.programDay01_Apr;

public class Circle extends Shape{
	
	double radius ;
	
	public Circle(double radius) {
		 super();
		this.radius=radius;
	}

	@Override
	double getArea() {
		return 2*3.14*radius*radius;
	}

	@Override
	void printDetails() {
		System.out.println("Type = "+getClass().getSimpleName());
		System.out.println("Radius="+radius);
		System.out.println("Area="+getArea());
		
	}
	

}
