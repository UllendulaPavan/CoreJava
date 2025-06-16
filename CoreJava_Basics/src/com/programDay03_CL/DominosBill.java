package com.programDay03_CL;


public class DominosBill {
	
	public static void main(String[]args) {
		
		String str = "hello world";
        int[] count = new int[256]; 
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {  
                count[ch]++;
            }
        }
        System.out.println("Count Occurrences of Each Character in a String");
        System.out.println("Character Count:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
		
		
	}
}