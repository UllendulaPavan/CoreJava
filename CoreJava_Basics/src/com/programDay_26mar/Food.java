package com.programDay_26mar;

abstract public class Food {

  double proteins;

  double fats;

  double carbs;

  double tastyScore;
  
  public Food(double proteins,double fats,double carbs) {
	  this.proteins=proteins;
	  this.fats=fats;
	  this.carbs=carbs;
//	  this.tastyScore=tastyScore;
  }
  
  abstract public void getMacroNutrients() ;
	  
  
}
