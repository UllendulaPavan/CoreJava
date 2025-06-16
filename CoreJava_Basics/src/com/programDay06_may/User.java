package com.programDay06_may;

public class User  {
	
	 private String name;
	 private VaccineEligibility eligibility;
	 private DoseBooking doseBooking;
	 
	public User(String name, int age, boolean hasHealthCondition) {
		super();
		this.name = name;
		eligibility = new VaccineEligibility(age,hasHealthCondition);
		doseBooking= new DoseBooking();
	}
   
	public boolean isEligible() {
		return eligibility.isEligible();
	}
    public void bookDose() {
    	if(!isEligible()) {
    		System.out.println(name+" is not eligible for the vaccine.");
    	}else {
    	doseBooking.bookDose();
    	System.out.println("Dose booked successfully for "+name);
	}
    }
    public boolean isDoseBooked() {
    	return doseBooking.isDoseBooked();
    }
}
