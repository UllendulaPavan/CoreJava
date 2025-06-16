package com.extra_question;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Count {

	public static void main(String[] args) {

		String name = "Hello World";
		name = name.toLowerCase();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {
			int c = 0, v = 0;
			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j) && i<=j)
					c++;
				if (name.charAt(i) == name.charAt(j) && i>j)
					v++;
			}
			if(v==0 && name.charAt(i)!=' ')
				
				m.put(name.charAt(i),c);

		}
		System.out.println(m);
		
		
		

	}

}
