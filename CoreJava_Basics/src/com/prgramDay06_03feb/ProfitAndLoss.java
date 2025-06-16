package com.prgramDay06_03feb;

public class ProfitAndLoss {

	public static void main(String[] args) {
		float costPrice=Float.parseFloat(args[0]);
		float sellingPrice=Float.parseFloat(args[1]);
		
		float profit=sellingPrice-costPrice;
		float loss =costPrice-sellingPrice;
		
		float profitPercentage =(profit/costPrice)*100;
		float lossPercentage =(loss/costPrice)*100;

		System.out.println("profitPercentage is :"+profitPercentage);
		System.out.println("lossPercentage is :"+ lossPercentage);
		
		

		
	}

}
