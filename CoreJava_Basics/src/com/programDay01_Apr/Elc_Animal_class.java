package com.programDay01_Apr;

public class Elc_Animal_class {

	public static void main(String[] args) {
		Animal a= new Lion();   //upcasting
		 a.roam();
		 getAnimal(a);
		 
		 Animal b =new Dog();
		 b.roam();
		 getAnimal(b);
		 
		 

	}
	public static void getAnimal( Animal a) {
		if(a instanceof Lion) {
			Lion c=(Lion)a;     //downcasting
			c.roar();
		}
		else {
			Dog d= (Dog)a;
			d.bark();
		}
	}

}
