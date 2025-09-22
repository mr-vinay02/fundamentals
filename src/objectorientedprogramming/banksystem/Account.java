package objectorientedprogramming.banksystem;

public class Account {

    private static int accountCounter = 1000; // auto increment account numbers
    private String ownerName;
    private int accountNumber;
    private double balance;

    // Constructor 1: with initial balance
    public Account(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.accountNumber = ++accountCounter; // auto-generate account number
    }

    // Constructor 2: default balance = 0
    public Account(String ownerName) {
        this(ownerName, 0.0);
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited into " + ownerName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from " + ownerName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Transfer method
    public void transfer(Account toAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from "
                    + this.ownerName + " to " + toAccount.ownerName);
        } else {
            System.out.println("Transfer failed. Check balance/amount.");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "Owner='" + ownerName + '\'' +
                ", AccountNumber=" + accountNumber +
                ", Balance=" + balance +
                '}';
    }
}





