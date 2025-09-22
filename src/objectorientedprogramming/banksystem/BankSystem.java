package objectorientedprogramming.banksystem;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank(10); // max 10 accounts

        // Create accounts
        Account acc1 = new Account("vinay", 5000);
        Account acc2 = new Account("ullas", 3000);
        Account acc3 = new Account("abhi"); // default balance = 0

        // Add accounts to bank
        bank.addAccount(acc1);

        bank.addAccount(acc2);
        bank.addAccount(acc3);

        System.out.println("\n--- Transactions ---");
        acc1.deposit(2000);
        acc2.withdraw(1000);
        acc1.transfer(acc2, 1500);
        acc3.deposit(800);

        System.out.println("\n--- Final Accounts ---");
        bank.displayAccounts();
    }
}
