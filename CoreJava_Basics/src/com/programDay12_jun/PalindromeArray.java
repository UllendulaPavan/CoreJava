package com.programDay12_jun;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeArray {

	public static void main(String[] args) {
		String[] words = { "madam", "hello", "racecar", "java", "level", "world" };

//		Map<String, Integer> collect = Arrays.stream(words).filter(s -> s.equals(new StringBuffer(s).reverse().toString()))
//				.collect(Collectors.toMap(x->x, String::length));
//		System.out.println(collect);
//		

//		for (String string : words) {
//			System.out.println(ispalindrome(string));
//		}
		System.out.println();
		
		
		// Palindrome
//		List<Integer> nums = List.of(100, 101, 200, 303, 444, 230, 767);
//		nums.stream().map(x -> x + "").filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
//				.forEach(System.out::println);
//		System.out.println();

		// Find the prime
		List<Integer> numbers = List.of(0, 1, 3, 4, 2, 11, 13, 34, 23); // 3 2 11 13 23
		numbers.stream().filter(x -> x > 1 && IntStream.range(2, x / 2 + 1).noneMatch((n) -> x % n == 0))
				.forEach(System.out::println);

		System.out.println();
		
		
		// Fibonacci
//		int n = 8; // 0 1 2 3 5 8 13 21
//	     //a -> 0 1             //b = 1 1
//		Stream.iterate(new int[] {0,1}, (s) -> new int[]{s[1],s[0]+s[1]}).limit(n).
//		forEach(p-> System.out.print(p[0]+" "));//0
	}

	public static boolean ispalindrome(String s) {

		int l = s.length();
		for (int i = 0; i <= l / 2; i++) { // madam
			if (s.charAt(i) != s.charAt(l - i - 1)) {
				return false;
			}
		}

		return true;
	}

}
