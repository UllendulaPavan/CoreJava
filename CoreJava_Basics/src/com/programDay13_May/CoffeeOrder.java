package com.programDay13_May;

public class CoffeeOrder {
	private Coffeetypes type;
	 private CoffeeSize size;
	 
	public CoffeeOrder(Coffeetypes type, CoffeeSize size) {
		super();
		this.type = type;
		this.size = size;
	}
	 
	public String getOrderDetails() {
		return "the coffe type is "+type+" and size is :"+size+"";
	}
	 
}
