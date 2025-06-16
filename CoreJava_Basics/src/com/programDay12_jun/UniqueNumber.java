package com.programDay12_jun;

import java.util.stream.Stream;

public class UniqueNumber {

	public static void main(String[] args) {
		
		Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		
		Stream.of(numbers).distinct().forEach(System.out::println);

	}

}
