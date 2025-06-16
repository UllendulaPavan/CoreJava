package com.programDay28_6mar;


public class DayScholar extends Student {
	double transportFee;
	double totalfee;
	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee=transportFee;
	}
	
	public String  displayDetails()
	   {
		   return toString();
	   }
	   public double payFee(double amt) 
	   {
		   
		   if(amt<0) {
			   System.out.println("Error Invalid Input");
		   }
		   double totalfee=examFee+transportFee;
		   
		   return amt-totalfee;
	   }

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	
	

	


	

}
