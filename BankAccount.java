import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private List<Transcation> transactionHistory;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
        	balance += amount;
        	transactionHistory.add(new Transcation());
        	System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        	balance -= amount;
        	transactionHistory.add(new Transcation());
        	System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transcation t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
