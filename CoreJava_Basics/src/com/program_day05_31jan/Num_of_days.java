package com.program_day05_31jan;

public class Num_of_days {

	public static void main(String[] args) {
		int totalDays=Integer.parseInt(args[0]);
		int year =totalDays/365;
		int months =totalDays%365/30;
		int days =totalDays%365%30;
		System.out.println("total days is :"+ totalDays);
		System.out.println("year is :"+year);
		System.out.println("months is :"+ months);
		System.out.println("days is :"+ days);

	}

}
