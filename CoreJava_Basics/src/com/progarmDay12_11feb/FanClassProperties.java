package com.progarmDay12_11feb;



public class FanClassProperties {
	
	String name;
	String coil;
	int Wing;
	
	
	public void switchON() {
		
		System.out.println("fan started and its rotates");
	}
	
	public void switchOFF(){
		System.out.println("fan stoped and its stops");
	}

	public static void main(String[] args) {
		FanClassProperties f1= new FanClassProperties();
		f1.switchON();
		f1.switchOFF();

	}

}
