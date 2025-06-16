package com.programDay28_6mar;

public class Hosteller extends Student {
	
	
	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public String  displayDetails()
	   {
		   return toString();
	   }
	   public double payFee(double amt) 
	   {
		   
		   if(amt <0) {
			   System.out.println("Error Invalid Input");
		   }
		   
		   double totalfee=examFee+hostelFee;
		
		   return amt-totalfee;
	   }

	
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}



	
}
