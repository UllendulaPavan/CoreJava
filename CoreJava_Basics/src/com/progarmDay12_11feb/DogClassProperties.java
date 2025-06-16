package com.progarmDay12_11feb;

public class DogClassProperties {
	
	public static void getDogInformation(String name,double height,int age) {
		System.out.println("Dog name is:"+name);
		System.out.println("Dog height is:"+height);
		System.out.println("Dog Age is :"+age);
	}
	
	public static void bark() {
		System.out.println("husky starting barking");
	}
	
	public static void main(String[] args) {
		
		getDogInformation("husky",4.5,3);
		bark();
	}
}
