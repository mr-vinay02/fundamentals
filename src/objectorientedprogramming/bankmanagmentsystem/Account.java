package objectorientedprogramming.bankmanagmentsystem;

public abstract class Account {

    private int accountNumber;
    private double balance;
    private Customer customer;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Account(int accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public void withdraw(int amount){
        if( getBalance() > amount )
            setBalance(getBalance() - amount);
        else
            System.out.println("Insufficient funds.....");
    }
    public abstract double calculateInterest();
}
