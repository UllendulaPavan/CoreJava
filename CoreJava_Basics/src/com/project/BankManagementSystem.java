package com.project;


	import java.util.*;

	class Account {
	    private String accountNumber;
	    private String accountHolder;
	    private double balance;

	    public Account(String accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds!");
	        }
	    }
	}

	class Bank {
	    private Map<String, Account> accounts = new HashMap<>();//

	    public void createAccount(String accountNumber, String accountHolder, double balance) {
	        if (!accounts.containsKey(accountNumber)) {
	            accounts.put(accountNumber, new Account(accountNumber, accountHolder, balance));
	            System.out.println("Account created successfully!");
	        } else {
	            System.out.println("Account number already exists!");
	        }
	    }

	    public void deposit(String accountNumber, double amount) {
	        Account acc = accounts.get(accountNumber);
	        if (acc != null) {
	            acc.deposit(amount);
	        } else {
	            System.out.println("Account not found!");
	        }
	    }

	    public void withdraw(String accountNumber, double amount) {
	        Account acc = accounts.get(accountNumber);
	        if (acc != null) {
	            acc.withdraw(amount);
	        } else {
	            System.out.println("Account not found!");
	        }
	    }

	    public void displayAccount(String accountNumber) {
	        Account acc = accounts.get(accountNumber);
	        if (acc != null) {
	            System.out.println("Account Number: " + acc.getAccountNumber());
	            System.out.println("Account Holder: " + acc.getAccountHolder());
	            System.out.println("Balance: " + acc.getBalance());
	        } else {
	            System.out.println("Account not found!");
	        }
	    }
	}

	public class BankManagementSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Bank bank = new Bank();

	        while (true) {
	            System.out.println("\n1. Create Account");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Display Account");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Account Number: ");
	                    String accNum = scanner.nextLine();
	                    System.out.print("Enter Account Holder Name: ");
	                    String accHolder = scanner.nextLine();
	                    System.out.print("Enter Initial Balance: ");
	                    double balance = scanner.nextDouble();
	                    bank.createAccount(accNum, accHolder, balance);
	                    break;
	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    accNum = scanner.nextLine();
	                    System.out.print("Enter Deposit Amount: ");
	                    double deposit = scanner.nextDouble();
	                    bank.deposit(accNum, deposit);
	                    break;
	                case 3:
	                    System.out.print("Enter Account Number: ");
	                    accNum = scanner.nextLine();
	                    System.out.print("Enter Withdrawal Amount: ");
	                    double withdraw = scanner.nextDouble();
	                    bank.withdraw(accNum, withdraw);
	                    break;
	                case 4:
	                    System.out.print("Enter Account Number: ");
	                    accNum = scanner.nextLine();
	                    bank.displayAccount(accNum);
	                    break;
	                case 5:
	                    System.out.println("Exiting system. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}


