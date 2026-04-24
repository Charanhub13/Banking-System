package com.BANK;

public class CurrentAccount extends BankAccount{

	    public CurrentAccount(String accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }
	    public String getAccountType() {
	        return "Current";
	    }

	    void withdraw(double amount) {
	    	if (amount <= 0) {
	    	    System.out.println("Invalid amount!");
	    	    return;
	    	}
	        balance -= amount;
	        addTransaction("Withdraw", amount);
	        System.out.println("Withdrawn from Current: " + amount);
	    }
}
