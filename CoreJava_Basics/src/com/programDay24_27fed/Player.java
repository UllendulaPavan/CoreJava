package com.programDay24_27fed;

public class Player {
	
	private int playerId;
	private String playerName;
	private int  playerAge;
	
	public Player(Student pavan) {
		this.playerId=pavan.getstudentId();
		this.playerName=pavan.getstudenName();
		this.playerAge=pavan.getstudentAge();
	}
	
	public void showDetails() {
		System.out.println("Player Details: Player ID:"+playerId+" , player Name:"+playerName+" ,player Age:"+playerAge);
		
	}
	
	public void updateName(String newName) {
		if(newName==null || newName.isEmpty()) {
			System.out.println("Error: Player name cannot be empty");
			System.exit(0);
		}else {
		this.playerName=newName;
		}
	}
	
	public  boolean isEligible() {
		if(playerAge < 18) {
			System.out.println("Is Player Eligible: False");
		   return false;
		}
		else {
			System.out.println("Is Player Eligible: True");
			return true;
		}
	}


}
