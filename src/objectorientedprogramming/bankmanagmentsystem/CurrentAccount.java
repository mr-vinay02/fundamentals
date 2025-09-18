package objectorientedprogramming.bankmanagmentsystem;

public class CurrentAccount extends Account{

    public CurrentAccount(int accountNumber, double balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0;
    }


}
