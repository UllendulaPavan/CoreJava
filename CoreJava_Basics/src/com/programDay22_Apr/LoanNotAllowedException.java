package com.programDay22_Apr;

public class LoanNotAllowedException extends RuntimeException{
    public LoanNotAllowedException(String str) {
    	super(str);
    }
}
