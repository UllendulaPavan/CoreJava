package com.extra_question;

import java.util.stream.Stream;

/*
 *     make the sum of the number
 *     find max
 *     find min
 *     count how many 
 *     find average
 *     filter
 *     |- based on even or odd or -ve or
 */
public class Program02 {
public static void main(String[] args) {
//	List<Integer > al=Arrays.asList(4,7,3,1,9,2,6);
//	IntSummaryStatistics data=
//	al.stream().collect(Collectors.summarizingInt(Integer::intValue));
//	System.out.println(data);
	
	 Stream<Integer> st = Stream.iterate(1,n->n+1).filter(n->n%2!=0).map(n->n*n);
     st.limit(10).forEach(System.out::println);

	
}
}
