package com.programDay24_27fed;

import java.util.Scanner;

public class SportsELC {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Sport Name: ");
//		String sportName=sc.nextLine();
//		
//		System.out.print("Team Size:");
//		int teamSize=sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("Sport Type:");
//		String sportType=sc.nextLine();
//		
//		
//		Sports game=new Sports(sportName,teamSize,sportType);
		
		Sports game=new Sports("foot",8,"jj");
		game.displayInfo();
		

	}

}
