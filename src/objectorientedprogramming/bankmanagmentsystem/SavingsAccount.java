package objectorientedprogramming.bankmanagmentsystem;

public class SavingsAccount extends Account{


    public SavingsAccount(int accountNumber, double balance, Customer customer) {
        super(accountNumber, balance, customer);
    }



    @Override
    public double calculateInterest() {
        return getBalance() * 0.4;
    }
}
