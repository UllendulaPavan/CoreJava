package com.programDay_02Apr;

import java.util.Locale.Category;

public class PhysicalProduct extends Product {
      
	private double shippingWeight;
	
	public PhysicalProduct(String name ,double  price ,String category,double shippingWeight) {
		super(name,price,category);
		this.shippingWeight=shippingWeight;
	}

	@Override
	public void applyDiscount(double percentge) {
		double dispercentage;
		double discount=getprice()*percentge/100;
		dispercentage=getprice()-discount;
		setprice(dispercentage);
		
		System.out.println("Shipping Weight: "+shippingWeight+" kg\r\n"
				+ "Discount applied :"+discount+"\r\n"
				+ "New Price :"+dispercentage+"\r\n"
				+ "Tax RS :"+calculateTax()+"\r\n"
				+ "Shipping Cost RS :"+calculateShippingCost()+"");
		
	}

	@Override
	public double calculateTax() {
		
		return getprice()*0.08;
	}
	
	public double calculateShippingCost() {
		return shippingWeight*5;
	}
}
