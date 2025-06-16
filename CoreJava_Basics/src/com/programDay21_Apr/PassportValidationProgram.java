package com.programDay21_Apr;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidPassportException extends RuntimeException{
	
	public InvalidPassportException(String str) {
		super(str);
	}
}
public class PassportValidationProgram {
	
	public static String getPassportNumberFromUser(String password){
	 boolean isdigit1 = Character.isDigit(password.charAt(0));
	 boolean isdigit2  =Character.isDigit(password.charAt(1)); 
	   if(isdigit1 && isdigit2) {
		      throw new InvalidPassportException("invalid pass");		
		   }else {
			int num = Integer.parseInt(password.substring(2,8));
			return password;
			
		    }
	}
	public static void validatePassportNumber(String pass){
		if(pass.length()!=9) {
			throw new InvalidPassportException("Length must be 9");
		}
	}
	
	
	public static void main(String[] args) {
	   
		Scanner sc =new Scanner (System.in);
		try(sc) {
			
	        System.out.println("Enter the password:First Two must be Alphabets and Remaining Shoub be Numbers"
	        		+ "\nEx:AB1234567");
	        String pass =sc.nextLine();
	        PassportValidationProgram.validatePassportNumber(pass);
	        PassportValidationProgram.getPassportNumberFromUser(pass);
	        	System.out.println("Your Passport Number is :"+pass.toUpperCase());
	        }
	        catch(InvalidPassportException e) {
	        	System.out.println(e.getMessage());
	         }
		   catch(NumberFormatException e){
			System.out.println("Please check the format of Password.");
		     }
	}

}
