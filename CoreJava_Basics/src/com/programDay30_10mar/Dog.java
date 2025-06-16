package com.programDay30_10mar;

public class Dog extends Mammal {
	
	private String breed;
	
	public Dog(String name,boolean hasFur,String breed) {
		super(name,hasFur);
		this.breed=breed;
	}
	
	public void setbreed(String breed) {
		this.breed=breed;
	}
	
	public String getbreed() {
		return this.breed;
	}

	@Override
	public String toString() {
		return "Dog [Animalname=" + getname() + ", hasFur=" + gethasFur() + ", breed=" + breed + "]";
	}
	
	

}
