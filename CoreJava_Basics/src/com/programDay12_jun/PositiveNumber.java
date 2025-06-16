package com.programDay12_jun;

import java.util.Arrays;

public class PositiveNumber {

	public static void main(String[] args) {
		
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		
	    Arrays.stream(numbers).filter(num -> num>0).forEach(System.out::println);

	}

}
