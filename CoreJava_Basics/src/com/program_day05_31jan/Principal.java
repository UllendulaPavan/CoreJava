package com.program_day05_31jan;

public class Principal {

	public static void main(String[] args) {
		int PrincipalSir =Integer.parseInt(args[0]);
		int Rate =Integer.parseInt(args[1]);
		int Time =Integer.parseInt(args[2]);
		int simpleInterest =(PrincipalSir*Rate*Time)/100;
        int totalAmount = simpleInterest+PrincipalSir;
        System.out.println("simple interest is :"+simpleInterest);
        System.out.println("total Amount is :"+totalAmount);
	}

}
