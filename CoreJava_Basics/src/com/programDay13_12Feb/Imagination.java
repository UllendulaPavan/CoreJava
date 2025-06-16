package com.programDay13_12Feb;

import java.util.*;
public class Imagination {
	
	int nareshId;
	String nareshName;
	double nareshFee;

	
	public void setdetails() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the nareshId:");
		nareshId=sc.nextInt();
		System.out.println("Enter the nareshName");
		nareshName=sc.nextLine();
		nareshName=sc.nextLine();
		System.out.println("Enter the nareshFee");
		nareshFee=sc.nextDouble();
		
		
	}
	public void getdetails() {
		System.out.println("nareshId is :"+nareshId);
		System.out.println("nareshName is :"+nareshName);
		System.out.println("nareshFee is :"+nareshFee);
		
	}
	public static void main(String[] args) {
		Imagination im=new Imagination();
		im.setdetails();
		im.getdetails();

	}

}
