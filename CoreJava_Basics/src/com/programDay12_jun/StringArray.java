package com.programDay12_jun;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
	
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		
		Arrays.stream(words).filter(str->str.length()>3).forEach(System.out::println);

	}

}
