package com.programday01_commandline;

public class VotingEligibilty {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age<18) 
		{
			System.out.println("not eligible for voting :"+age);
		}
		else
		{
			System.out.println("eligible for voting :"+age);
		}
	}

}
