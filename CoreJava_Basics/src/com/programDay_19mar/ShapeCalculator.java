package com.programDay_19mar;

public class ShapeCalculator {
	
	final double PI=3.14;
	public int calculateArea(int sideLength) {
		 if(sideLength<=0) {
			System.out.println("Error: Side length must be non-negative.");
//			System.exit(0);
			return 0;
		}
		else {
			return (sideLength * sideLength);
		}
	}
	
	public int calculateArea(int length, int width) {
		if(length<=0 ) {
			System.out.println("Error: Length and width must be non-negative.");
//			System.exit(0);
			return 0;
		}
		else {
		return ( length * width);
		}
	}
	
	public double calculateArea(double radius) {
		
		return (PI * (radius*radius));
	}


}
