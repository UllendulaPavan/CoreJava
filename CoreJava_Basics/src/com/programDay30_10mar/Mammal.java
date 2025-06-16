package com.programDay30_10mar;

public class Mammal extends Animal {
	
	private boolean hasFur;
	
	public Mammal(String name,boolean hasFur) {
		super(name);
		this.hasFur=hasFur;
	}
	
	public void sethasFur(boolean hasFur) {
		this.hasFur=hasFur;
	}
	
	public boolean gethasFur() {
		return this.hasFur;
	}

}
