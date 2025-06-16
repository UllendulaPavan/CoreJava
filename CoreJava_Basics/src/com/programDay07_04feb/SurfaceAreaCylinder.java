package com.programDay07_04feb;

import java.util.Scanner;

public class SurfaceAreaCylinder {

	public static void main(String[] args) {
//		float r=Float.parseFloat(args[0]);
//		float h=Float.parseFloat(args[1]);
//		float pi=3.14F;
//		float result =2*(3.14f)*r*h+2*(3.14f)*r*r;
//		System.out.println(result);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the r h value:");
		float r =sc.nextInt();
		float h =sc.nextInt();
		float pi=3.14F;
		float result =2*(pi)*r*h+2*(pi)*r*r;
		System.out.println(result);
		
		sc.close();

	}

}
