package service;

import java.util.List;

import model.Account;
import model.Transaction;

public class AccountService{
    public void deposit(Account account, double amount){
        if (amount <= 0) {
            System.out.println("O valor do depósito deve ser maior que 0");
        }

        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);

        account.getTransactions().add(new Transaction("RECEITA", "Depósito", amount));
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

        account.getTransactions().add(new Transaction("DESPESA", "Saque", amount));
    }

    public void registerTransaction(Account account, String type, String description, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O valor da transação deve ser maior que 0.");
        }

        if (type.equals("DESPESA")) {
            if (amount > account.getBalance()) {
                throw new IllegalArgumentException("Saldo insuficiente para realizar este pagamento!");
            }
            account.setBalance(account.getBalance() - amount);
            
        } else if (type.equals("RECEITA")) {
            account.setBalance(account.getBalance() + amount);
            
        } else {
            throw new IllegalArgumentException("Tipo de transação inválido.");
        }
    }

    public double checkBalance (Account account){
        return account.getBalance();
    }

    public List<Transaction> getStatement(Account account) {
        return account.getTransactions();
    }
} 