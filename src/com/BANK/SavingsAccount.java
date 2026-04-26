package com.BANK;

public class SavingsAccount extends BankAccount{


	    public SavingsAccount(String accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }

	    @Override
		public String getAccountType() {
	        return "Savings";
	    }

	    @Override
		void withdraw(double amount) {
	    	if (amount <= 0) {
	    	    System.out.println("Invalid amount!");
	    	    return;
	    	}
	        if (amount <= balance) {
	            balance -= amount;
	            addTransaction("Withdraw", amount);
	            System.out.println("₹" + amount + " withdrawn successfully.");
	            } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
}
