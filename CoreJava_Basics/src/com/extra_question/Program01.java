package com.extra_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program01 {
public static void main(String[] args) {
	List<String> al=Arrays.asList("mango","apple","banana","kiwi");
	System.out.println(al);
	
	List<String> result=
	al.stream().sorted(Comparator.
			comparingInt(String::length)
			.thenComparing(Comparator.naturalOrder()))
	 .collect(Collectors.toList());
	
	System.out.println(result);
	
	
	al.stream().sorted(Comparator.reverseOrder())
	.map(e->e+" ")
	 .forEach(System.out::print);
}
}
