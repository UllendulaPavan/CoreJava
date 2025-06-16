package com.programDay10_Apr;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {
	
	public static boolean testPredicate(int num, Predicate<Integer> p) {
		return p.test(num);
	}

	public static void main(String[] args) {
		
	Predicate<Integer> isEven = (num)-> num%2==0;
	
    Predicate<Integer> isGreaterThanTen = (num)-> num>10;
    Predicate<Integer> isPrime =(num)->//num=11
    {
    	if(num==1) {
			return false;
		}
    	for(int i=2;i*i<num;i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	return true;
    	
    };
      
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    
    System.out.println(num+" is even: "+testPredicate(num, isEven)+"\r\n"
    		+ ""+num+" is greater than 10: "+testPredicate(num, isGreaterThanTen)+"\r\n"
    		+ ""+num+" is prime: "+testPredicate(num, isPrime)+"\r\n"
    		+ "");

	}

}
