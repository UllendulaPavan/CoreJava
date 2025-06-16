package com.programDay15_14feb;

public class CricketMatach2 {

	public static void main(String[] args) {
		Batter BT =new Batter();
		
		
		BT.batterDetails("sachin",18000,463);
		System.out.println("compute Batting Average:");
		BT.computeBattingAverage(); 
		System.out.println("\nget Statistics :");
		BT.getStatistics();

	}

}
