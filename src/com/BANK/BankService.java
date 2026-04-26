package com.BANK;
import java.util.HashMap;
import java.util.Map;

	class BankService {
	    private Map<String, BankAccount> accounts = new HashMap<>();

	    public void createAccount(BankAccount account) {
	    	 if (accounts.containsKey(account.getAccountNumber())) {
		            System.out.println("Account already exists!");
		            return;
		        }
	        accounts.put(account.getAccountNumber(), account);
	        System.out.println("Account created successfully!");
	       
	    }


	    public BankAccount getAccount(String accNo) {
	        return accounts.get(accNo);
	    }

	    public void displayAllAccounts() {
	        for (BankAccount acc : accounts.values()) {
	            System.out.println(acc.getAccountNumber() + " - " +
	                    acc.getAccountHolder() + " - " +
	                    acc.getAccountType() + " - Balance: " +
	                    acc.getBalance());
	        }
	    }
}
