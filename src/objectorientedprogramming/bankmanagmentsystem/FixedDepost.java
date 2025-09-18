package objectorientedprogramming.bankmanagmentsystem;

public class FixedDepost extends Account{

    public FixedDepost(int accountNumber, double balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public double calculateInterest() {
        return 0.8 * getBalance();
    }
}
