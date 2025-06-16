package com.programDay12_jun;

import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		Stream.of(numbers).filter(PrimeNumber::isprime).forEach(System.out::println);

	}
	
	public static boolean isprime(Integer t) {
		
		for(int i=2;i<t/2;i++) {
			
			if(t%i==0) {
				
				return false;
			}
		}
		return true;
		
	}

}
