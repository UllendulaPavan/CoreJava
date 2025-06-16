package com.programDay12_jun;

import java.util.Arrays;
import java.util.List;

public class FirstLetterString {

	public static void main(String[] args) {
		
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		 
		Arrays.stream(names).map(str->str.charAt(0)).forEach(System.out::println);
		
		
		//unique charactor 
//		List<String> str = List.of("Hello world@","Ja&va is awesome?","Java is a* platform.");
//		str.stream().flatMap(s -> Arrays.stream(s.split("\\s"))).
//		map(s -> s.replaceAll("\\p{Punct}", "")).
//		distinct().
//		forEach(x -> System.out.println(x.toLowerCase()));

	}

}
