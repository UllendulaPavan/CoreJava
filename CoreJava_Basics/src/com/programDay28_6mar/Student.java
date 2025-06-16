package com.programDay28_6mar;

public class Student {
   protected int studentId;
   protected String name ;
   protected double examFee;
   
   public Student(int studentId, String name, double examFee) {
	   super();
	   this.studentId = studentId;
	   this.name = name;
	   this.examFee = examFee;
   }
   
   public String  displayDetails()
   {
	   return toString();
   }
   public double payFee(double amt) 
   {
	   double remfee=amt-examFee;
	   if(amt <0) {
		   System.out.println("Error Invalid Input");
	   }
//	   if(remfee==0) {
//		   System.out.println("All Fees are clear");
//	   }
	   return remfee;
   }

   @Override
  public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
   }
   
 
}
