package model;

public class Transaction {
    private int type;
    private String description;
    private double amount;


    public Transaction(int type, String description, double amount) {
        this.type = type;
        this.description = description;
        this.amount = amount;
    }


}
