package model;

public class Transaction {
    private String type;
    private String description;
    private double amount;


    public Transaction(String type, String description, double amount) {
        this.type = type;
        this.description = description;
        this.amount = amount;
    }


    public String getType() {
        return type;
    }


    public String getDescription() {
        return description;
    }


    public double getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return String.format("[%s] %s : R$ %.2f", type, description, amount);
    }

    

}
