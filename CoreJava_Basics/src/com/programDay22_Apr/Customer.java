package com.programDay22_Apr;

public class Customer {
  
	private String name;
	private BankAccount account;
	
	public Customer(String name,BankAccount account) {
		this.name=name;
		this.account=account;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	public String getname() {
		return name;
	}
}
