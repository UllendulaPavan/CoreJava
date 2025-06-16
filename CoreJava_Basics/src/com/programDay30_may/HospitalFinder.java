package com.programDay30_may;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalFinder {

	public static void main(String[] args) {
		
		HospitalService hs=new HospitalService();
		
		ArrayList<String> treatment= new ArrayList<String>();
	   Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the name:");
	    String name =sc.nextLine();
	    System.out.println("Enter the list of Treatments:");
	    List<String> l =new ArrayList<String>();
		int treatment1=Integer.parseInt(sc.nextLine());
		 for(int i=0;i<treatment1;i++) {
			 System.out.println("Enter the Treatment"+(i+1)+":");
			  String name1=sc.nextLine();
			  l.add(name1);
		 }
		 System.out.println("Enter the contact person:");
		 String person =sc.nextLine();
		 System.out.println("Enter the contect number:");
		 String number=sc.nextLine();
		 System.out.println("Enter the location :");
		 String loc =sc.nextLine();
		 Hospital h1=new Hospital( name, treatment, person, number, loc);
		 hs.addHospital(h1);
		System.out.println( hs.getHospitalDetails(100));
		 System.out.println(hs.getHospitals());

	}

}
