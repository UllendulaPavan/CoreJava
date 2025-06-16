package com.programDay_02Apr;

public class DigitalProduct extends Product{
	
	private  String licenseKey;
	
	public DigitalProduct(String name ,double  price ,String category,String licensekey) {
		super(name,price,category);
		this.licenseKey=licensekey;
	}

	@Override
	public void applyDiscount(double percentage) {
		double dispercentage;
		double discount=getprice()*percentage/100;
		dispercentage=getprice()-discount;
		setprice(dispercentage);
		
		System.out.println("License Key: "+licenseKey+"\r\n"
				+ "Discount applied :"+discount+"\r\n"
				+ "New Price :"+getprice()+"\r\n"
				+ "Tax RS :"+calculateTax());
		
	}

	@Override
	public double calculateTax() {
		
		return getprice()*0.05;
	}
	
	
}
