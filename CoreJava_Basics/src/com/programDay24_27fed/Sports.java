package com.programDay24_27fed;

public class Sports {
	
	private String  sportName;
	private int teamSize;
	private String sportType;
	
	
	public  Sports() {
		this.sportName="unknow";	
     	this.teamSize=0;
		this.sportType="unknow";
	}
	
	public Sports(String sportName, int teamSize) {
		this.sportName=sportName;
		
		if(teamSize<0) {
			System.out.println("Error:Team size must be positive.");
			System.exit(0);
		}else {
			this.teamSize=teamSize;
		}
		
		this.sportType="Unknown";
	}
	
	public Sports(String sportName,int teamSize,String sportType) {
		this.sportName=sportName;
		
		if(teamSize<0) {
			System.out.println("Error:Team size must be positive.");
		}else {
			this.teamSize=teamSize;
		}
		
		this.sportType=sportType;
	}
	
	
	public void displayInfo() {
	   System.out.println("Sport Name:"+sportName);
	   System.out.println("Team Size:"+teamSize);
	   System.out.println("Sport Type:"+sportType);
	}

}
