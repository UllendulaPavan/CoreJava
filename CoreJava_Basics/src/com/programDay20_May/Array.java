package com.programDay20_May;

import java.util.Arrays;

public class Array {
   public static void main(String[] args) {
	
	   int arr[]= {5,6,8,3,1,2,5,7,0,7};
	   
//	   Arrays.sort(arr);
//	   for(int a :arr) {
//		   System.out.println(a);
//	   }  
	   
	   
	   //normal sorting
	   
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   int t =arr[i];
				   arr[i]=arr[j];
				   arr[j]=t;
			   }
		   }
	   }
	   
	   System.out.println(Arrays.toString(arr));
	   
	   
	   for(int i=0;i<arr.length-1;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   int t =arr[i];
				   arr[i]=arr[j];
				   arr[j]=t;
			   }
		   }
	   }
	   
	   System.out.println(Arrays.toString(arr));
	   
	   
	   
	   //Bubble Sort:
	   
//	   for(int i=0;i<arr.length;i++) {
//		   for(int j=0;j<arr.length-1-i;j++) {
//			   if(arr[j]>arr[j+1]) {
//				   int t =arr[j];
//				   arr[j]=arr[j+1];
//				   arr[j+1]=t;
//			   }
//		   }
//	   }
//	   System.out.println(Arrays.toString(arr));
//}

	   
	   
	   
	   
	   for (int i = 1; i <arr.length; i++) {
		      // store the current value at current in key
		      int key = arr[i];

		      // pointer to index just before the key's index
		      int j = i - 1;

		      /* move values in arr[0...i-1] greater
		       * than key one position to their right
		       */
		      while (j >= 0 && key < arr[j]) {
		        arr[j + 1] = arr[j];
		        j--;
		      }

		      /* store the key just before the last shifted element
		       * or after the element just smaller than or equal to the key
		       */
		      arr[j + 1] = key;
		    }
		  }

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

}

