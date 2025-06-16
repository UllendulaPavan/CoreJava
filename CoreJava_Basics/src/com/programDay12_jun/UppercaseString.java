package com.programDay12_jun;

import java.util.Arrays;

public class UppercaseString {

	public static void main(String[] args) {
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
         
		Arrays.stream(names).map(str-> str.toUpperCase()).forEach(System.out::println);

	}

}
