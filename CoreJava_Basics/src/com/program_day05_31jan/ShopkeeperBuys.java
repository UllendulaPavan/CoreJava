package com.program_day05_31jan;

public class ShopkeeperBuys {

	public static void main(String[] args) {
		
		double costPrice=32500;
		double ProfitPercentage=27;
		double vatPercentage=12.7;
		double ServiceChargepercentage =3.87;
		
		double totalselling,profit,vat,sc,sellingPrice;
		
		profit=costPrice*(ProfitPercentage/100);
		sellingPrice= costPrice+profit;
		
		vat=sellingPrice*(vatPercentage/100);
		
		sc=sellingPrice*(ServiceChargepercentage/100);
		
		totalselling=sellingPrice+vat+sc;
		
		System.out.println("profit is :"+profit);
		System.out.println("total selling price is :"+ totalselling);
		System.out.println("vat is :" +vat );
		System.out.println("service charge is  :" + sc);
		

	}

}
