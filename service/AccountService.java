package service;

import model.Account;

public class AccountService{
    public void deposit(Account account, double amount){
        if (amount <= 0) {
            System.out.println("O valor do depósito deve ser maior que 0");
        }

        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
    }

    public void withdraw(Account account, double amount){
        if (amount <= 0) {
            System.out.println("O valor de saque deve ser maior que 0!");
        }

        if (amount > account.getBalance()) {
            System.out.println("Saldo insuficiente para saque!");
        }

        double newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
    }

    public double checkBalance (Account account){
        return account.getBalance();
    }
} 