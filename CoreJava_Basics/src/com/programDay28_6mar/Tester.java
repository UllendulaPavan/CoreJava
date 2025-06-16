package com.programDay28_6mar;

public class Tester {

	public static void main(String[] args) {
		
		
		DayScholar d1=new DayScholar(1, "pavan", 40000,5000);
		
		System.out.println(d1.displayDetails());
		
		double ramt=d1.payFee(50000);
		
		if(ramt>0)
		{
			System.out.println("return to remaining amount to student :"+(ramt));
		}
		else if(ramt<0)
		{
			System.out.println("Remaining amount to pay is: "+(-ramt));
		}
		else
		{
			System.out.println("All Fees are clear");
		}
		
		
		Hosteller h1 =new Hosteller(2, "dheeraj", 25000, 8000);
		
		System.out.println(h1.displayDetails());
		
		double remainingAmout=h1.payFee(55000);
		
		if(remainingAmout>0)
		{
			System.out.println("return to remaining amount to student :"+(remainingAmout));
		}
		else if(remainingAmout<0)
		{
			System.out.println("Remaining amount to pay is: "+(-remainingAmout));
		}
		else
		{
			System.out.println("All Fees are clear");
		}

	}

}
