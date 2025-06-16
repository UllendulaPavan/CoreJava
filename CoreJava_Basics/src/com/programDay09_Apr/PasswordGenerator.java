package com.programDay09_Apr;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {

	public static void main(String[] args) {
		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 
		 String total=upper+lower+digits+special;
		 
		 Supplier<String> pwdSupplier =()->
		 {
			 Random random =new Random();
			 String password="";
			 for(int i=0;i<8;i++) {
				 int index=random.nextInt(total.length());
				 password=password+total.charAt(index);
			 }
			 return password;
		 };
//		 pwdSupplier pwd =(pwdSupplier) pwdSupplier.get();
          System.out.println("Generated Password:"+ pwdSupplier.get());
	}

}
