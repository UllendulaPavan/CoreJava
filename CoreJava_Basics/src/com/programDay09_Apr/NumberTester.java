package com.programDay09_Apr;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester {
	
 public static boolean testPredicate(Predicate<Integer> p , int num)
		  {
			  return p.test(num);
		  }
   public static void main(String [] args) {
	   
	   Predicate<Integer> isEven = (num)->num%2==0;
	   
	   Predicate<Integer> isPrime=(num) ->{
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
	   
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int num=sc.nextInt();
	 
	  System.out.println("Is "+num+" even?"+testPredicate(isEven,num));
	  System.out.println("Is "+num+" prime?"+testPredicate(isPrime,num));
   }
}

 
