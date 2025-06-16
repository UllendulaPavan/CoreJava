package com.programDay12_jun;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertIntTOString {

	public static void main(String[] args) {
		
		 Integer[] numbers = {10, 20, 30, 40, 50};
		 Arrays.stream(numbers).map(num ->"number :"+num).forEach(System.out::println);
	}

}
