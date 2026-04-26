package com.BANK;
import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        BankService bank = new BankService();
	        System.out.println("!!!!! Banking System !!!!!!");
	        while (true) {
	        	System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. View All Accounts\n5. Transactions\n6. Check Balance\n7. Exit");      int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Acc No: ");
	                    String accNo = sc.next();

	                    System.out.print("Enter Name: ");
	                    String name = sc.next();

	                    System.out.print("Enter Balance: ");
	                    double bal = sc.nextDouble();

	                    int type;
	                    while (true) {
	                        System.out.println("Enter Account Type");
	                        System.out.print("1. Savings  2. Current\n");
	       	                System.out.print("Choose option: ");

	                        type = sc.nextInt();

	                        if (type == 1 || type == 2) {
	                            break;
	                        } else {
	                            System.out.println("Invalid choice! Please try again.\n");
	                        }
	                    }
	                    BankAccount acc;
	                    if (type == 1) {
	                        acc = new SavingsAccount(accNo, name, bal);
	                    } else {
	                        acc = new CurrentAccount(accNo, name, bal);
	                    }
	                    bank.createAccount(acc);
	                    break;


	                case 2:
	                    System.out.print("Enter Acc No: ");
	                    accNo = sc.next();

	                    BankAccount depositAcc = bank.getAccount(accNo);
	                    if (depositAcc != null) {
	                        System.out.print("Enter amount: ");
	                        depositAcc.deposit(sc.nextDouble());
	                    } else {
	                        System.out.println("Account not found!");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Acc No: ");
	                    accNo = sc.next();

	                    BankAccount withdrawAcc = bank.getAccount(accNo);
	                    if (withdrawAcc != null) {
	                        System.out.print("Enter amount: ");
	                        withdrawAcc.withdraw(sc.nextDouble());
	                    } else {
	                        System.out.println("Account not found!");
	                    }
	                    break;

	                case 4:
	                    bank.displayAllAccounts();
	                    break;

	                case 5:
	                    System.out.print("Enter Acc No: ");
	                    accNo = sc.next();

	                    BankAccount txnAcc = bank.getAccount(accNo);
	                    if (txnAcc != null) {
	                        txnAcc.showTransactions();
	                    } else {
	                        System.out.println("Account not found!");
	                    }

	                    break;

	                case 6:
	                    System.out.print("Enter Acc No: ");
	                    accNo = sc.next();

	                    BankAccount balAcc = bank.getAccount(accNo);
	                    if (balAcc != null) {
	                        System.out.println("Balance: " + balAcc.getBalance());
	                    } else {
	                        System.out.println("Account not found!");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Thank you!");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
}
