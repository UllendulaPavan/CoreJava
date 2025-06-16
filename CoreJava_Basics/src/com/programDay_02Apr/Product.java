package com.programDay_02Apr;

public abstract class Product {
	private String name ; 
	private double  price ;
	private String category ;
	 
	 public Product( String name ,double  price ,String category) {
		 this.name=name;
		 this.price=price;
		 this.category=category;
	 }
	 
	 public abstract void  applyDiscount(double percentge);
	 
	 public abstract double  calculateTax();
	 
	 public void setname(String name) {
		 this.name=name;
	 }
	 
	 public String getname() {
		 return this.name;
	 }
	 
	 public void setprice(double price) {
		 this.price=price;
	 }
	 
	 public double getprice() {
		 return this.price;
	 }
	 
	 public void setcategory(String category) {
		 this.category=category;
	 }
	 
	 public String getcategory() {
		 return this.category;
	 }
	 
	 public String toString() {
		 return "Product Name:"+name+"\n"
				 +"Category:"+category+"\n"
				 +"Price RS:"+price;
	 }

	


}
