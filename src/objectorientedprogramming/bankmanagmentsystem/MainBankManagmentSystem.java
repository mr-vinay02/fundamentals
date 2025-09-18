package objectorientedprogramming.bankmanagmentsystem;

public class MainBankManagmentSystem {

    public static void main(String[] args) {


        // for the Savings Account
        Customer savingsCustomer = new Customer(101,"Vinay");
        Account savingsAccount = new SavingsAccount(1234567890,5000,savingsCustomer);
        System.out.println("Initial balance of the Account  "+savingsAccount.getBalance());
        System.out.println("Interest on the Amount on the Account "+savingsAccount.calculateInterest());


        // for the Current Account
        Customer currentCustomer = new Customer(101,"vijay");
        Account currentAccount = new CurrentAccount(1234567890,5000,currentCustomer);
        System.out.println("Initial balance of the Account "+currentAccount.getBalance());
        System.out.println("Interest on the Amount on the Account "+currentAccount.calculateInterest());


        // for the FixedDeposit
        Customer fixedDepositCustomer = new Customer(103,"ullas");
        Account fixedDeposit = new FixedDepost(1234567890,5000,fixedDepositCustomer);
        System.out.println("Initial balance of the Account "+fixedDeposit.getBalance());
        System.out.println("Interest on the Amount on the Account "+fixedDeposit.calculateInterest());


    }
}
