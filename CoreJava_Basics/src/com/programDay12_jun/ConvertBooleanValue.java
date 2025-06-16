package com.programDay12_jun;

import java.util.Arrays;

public class ConvertBooleanValue {

	public static void main(String[] args) {
		
		Boolean[] flags = {true, false, true, false, true};
		
		Arrays.stream(flags).map(ConvertBooleanValue::isBoolean).forEach(System.out::println);

	}
	
	 public static String isBoolean(Boolean b ) {
		  if(b) {
			  return "yes";
		  }
		   return "no" ;
		 
		 
	 }

}
