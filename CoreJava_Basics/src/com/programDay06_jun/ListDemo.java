package com.programDay06_jun;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

	public static void main(String[] args) {
		 List<String> str = List.of(
				 "Hello", "", "World", " ", "from", " ", "Java", "!"
				        );
		 List<String> str1 = List.of(
				 "Hello", "", "World", " ", "from", " ", "Java", "!"
				        );
//		 Stream<String> stream1 = str.stream();
//		 Stream<String> stream2 = str1.stream();
	Stream<String> concat = Stream.concat(str.stream(),str1.stream());
String collect = concat.collect(Collectors.joining());
System.out.println(collect);
				      String s=  str.stream().collect(Collectors.joining());
				      System.out.println(s);
				      
				      
				         // str.stream().flatMap(s -> Stream.of(s)).collect(Collectors.toList()).forEach(System.out::print);
				     }

				     //Stream.concat(str).forEach(System.out::print);

	}


