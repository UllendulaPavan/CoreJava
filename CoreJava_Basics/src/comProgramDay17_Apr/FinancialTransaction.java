package comProgramDay17_Apr;

public class FinancialTransaction {
    
	public void  processTransaction( double transactionAmount, long accountNumber) {
		
		if(transactionAmount<0 || accountNumber<0) {
			throw new IllegalArgumentException("Error processing transaction: Transaction amount must be positive.");
		}else {
			System.out.println("Transaction successful: Amount Rs."+transactionAmount+" transferred to account "+accountNumber);
		}
	}		
}
