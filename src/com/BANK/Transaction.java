package com.BANK;

import java.time.LocalDateTime;

class Transaction {
    private String type;
    private double amount;
    private String date;   

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now().toString(); 
    }

    public String toString() {
        return type + " : " + amount + " on " + date;
    }
}
