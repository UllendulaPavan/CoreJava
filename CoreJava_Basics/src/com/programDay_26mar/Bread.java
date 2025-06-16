package com.programDay_26mar;

public class Bread extends Food{

	int tastyScore = 8 ;
	String type = "vegetarian";
			
	public Bread(double proteins,double fats,double carbs) {
		super(proteins,fats,carbs);
		
	}

	public String getType() {
		return type;
	}
	
	public int getTaste() {
		return tastyScore;
	}
	
	@Override
	public void getMacroNutrients() {
		System.out.println("A slice of bread has ["+this.proteins+"] gms of protein, ["+this.fats+"] gms of fats and ["+this.carbs+"] gms of carbohydrates.");
	}
	
	

}
