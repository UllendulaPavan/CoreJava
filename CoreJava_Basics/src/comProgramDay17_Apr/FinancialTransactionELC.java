package comProgramDay17_Apr;

import java.util.InputMismatchException;
import java.util.Scanner;
public class FinancialTransactionELC {

	public static void main(String[] args) {
	     
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Transaction amount:");
			double amount = Double.parseDouble(sc.next());	
			
			System.out.println("Account number:");
			long number=sc.nextLong();
			
			FinancialTransaction f= new FinancialTransaction();
	        f.processTransaction(amount, number);
			
		}
		catch(NumberFormatException e) {
			System.err.println("Invalid input: Please enter a valid number for transaction ammount");
		}
		catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.err.println(e +" Generic Exception");
		}
		
	}

}
