package model;

import java.util.ArrayList;
import java.util.List;

public class Account{
    private double balance;
    private List<Transaction> transactions;

    public Account(double balance) {
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> geTransactions(){
        return transactions;
    }

} 