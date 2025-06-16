package com.programDay07_04feb;

import java.util.Scanner;

public class SurfaceAreaCube {

	public static void main(String[] args) {
//		int side=Integer.parseInt(args[0]);
		 Scanner sc =new Scanner(System.in);
		System.out.println("Enter side :");
		int side =sc.nextInt();
		int result=6*(side*side);
     System.out.println("curved surface area of a cube :"+result);
	}

}
