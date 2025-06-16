package com.programDay06_jun;

import java.util.HashMap;
import java.util.Map;

public class StudentIDManagement {

	public static void main(String[] args) {
		 HashMap<String,Integer> hs=new HashMap<>();
         hs.put("John",101);
         hs.put("Alice",102);

         hs.putIfAbsent("Bob",103);
         hs.putIfAbsent("John",104);

         for(Map.Entry<String,Integer>  str : hs.entrySet() ){
           System.out.println(str.getKey()+"-> "+str.getValue());
         }

	}

}
