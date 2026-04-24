package com.BANK;
import java.util.ArrayList;
import java.util.List;

	abstract class BankAccount {
	    private String accountNumber;
	    private String accountHolder;
	    protected double balance;

	    private List<Transaction> transactions = new ArrayList<>();

	    public BankAccount(String accountNumber, String accountHolder, double balance) {
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
	    	if (amount <= 0) {
	    	    System.out.println("Invalid amount!");
	    	    return;
	    	}
	        balance += amount;
	        transactions.add(new Transaction("Deposit", amount));
	        System.out.println("₹" + amount + " deposited successfully.");	    }

	    protected void addTransaction(String type, double amount) {
	        transactions.add(new Transaction(type, amount));
	    }

	    public void showTransactions() {
	        System.out.println("Transaction History:");
	        if (transactions.isEmpty()) {
	            System.out.println("No transactions found.");
	        } else {
	            for (Transaction t : transactions) {
	                System.out.println(t);
	            }
	        }
	    }

	    public abstract String getAccountType();
	    abstract void withdraw(double amount);
}
