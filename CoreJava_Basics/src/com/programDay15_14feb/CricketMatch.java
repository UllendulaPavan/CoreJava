package com.programDay15_14feb;

public class CricketMatch {

	public static void main(String[] args) {
		BowlerDetails ck=new BowlerDetails();
		
		ck.DowlerDetails ("Sachin",10,5,750,463);
		 System.out.println("Bowling Average:");
		ck.computeBowlingAverage();
		System.out.println("\nStrike Rate:");
		ck.computeStrikeRate();
		System.out.println("\nStatistics:");
		 ck.showStatistics();
		
	}

}
