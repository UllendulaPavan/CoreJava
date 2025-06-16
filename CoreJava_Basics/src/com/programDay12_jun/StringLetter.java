package com.programDay12_jun;

import java.util.stream.Stream;

public class StringLetter {

	public static void main(String[] args) {
		
		String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		
		Stream.of(names).filter(str -> str.contains("A") || str.contains("a")).forEach(System.out::println);
         

	}

}
