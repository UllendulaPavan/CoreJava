package com.programDay04_CL;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
          int count=0;
          for(int i=1;i<=num;i++)
          {
        	  if(i%2==0) {
        		  count++;
        	  }
        	  
          }
          if(count==2) {
        	  System.out.println("it is a prime number :"+num);
          }
    	  else {
    		  System.out.println("it is not a prime number :"+num);
    	  }
	}

}
