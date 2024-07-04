import java.util.ArrayList;
import java.util.List;

class AccountHolder {
    private String name;
    private long accountNumber;
    private double balance;

    public AccountHolder(String name, long accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class Bank {
    private List<AccountHolder> accountHolders;

    public Bank() {
        accountHolders = new ArrayList<>();
    }

    public void addAccountHolder(String name, long accountNumber, double initialBalance) {
        AccountHolder newAccountHolder = new AccountHolder(name, accountNumber, initialBalance);
        accountHolders.add(newAccountHolder);
        System.out.println("Account created for " + name + " with account number " + accountNumber);
    }

    public AccountHolder getAccountHolder(long accountNumber) {
        for (AccountHolder accountHolder : accountHolders) {
            if (accountHolder.getAccountNumber() == accountNumber) {
                return accountHolder;
            }
        }
        return null; // Account not found
    }

    public List<AccountHolder> getAllAccountHolders() {
        return accountHolders;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccountHolder("Alice", 1001, 1000.0);
        bank.addAccountHolder("Bob", 1002, 1500.0);

        AccountHolder alice = bank.getAccountHolder(1001);
        AccountHolder bob = bank.getAccountHolder(1002);

        if (alice != null) {
            alice.deposit(500.0);
            alice.withdraw(200.0);
        }

        if (bob != null) {
            bob.deposit(100.0);
            bob.withdraw(2000.0);
        }

        System.out.println("Account Holders:");
        for (AccountHolder accountHolder : bank.getAllAccountHolders()) {
            System.out.println(accountHolder.getName() + "'s balance: $" + accountHolder.getBalance());
        }
    }
}
