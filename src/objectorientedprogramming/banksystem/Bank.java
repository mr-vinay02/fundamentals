package objectorientedprogramming.banksystem;

public class Bank {

    private Account[] accounts;
    private int accountCount;

    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        accountCount = 0;
    }

    // Add a new account
    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = account;
            System.out.println("Account created for " + account.getOwnerName());
        } else {
            System.out.println("Bank is full! Cannot create more accounts.");
        }
    }

    // Find account by account number
    public Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    // Display all accounts
    public void displayAccounts() {
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
        }
    }



}
