// Abstract class representing a generic bank account
abstract class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Encapsulation: Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display basic account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Abstract method to be implemented by specific account types
    public abstract void calculateInterest();
}

// SavingsAccount subclass demonstrating inheritance and abstraction
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        // Savings account gets 5% interest
        double interest = getBalance() * 0.05;
        System.out.println("Savings Account Interest: " + interest);
    }
}

// CurrentAccount subclass demonstrating inheritance and abstraction
class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        // Current account gets 2% interest
        double interest = getBalance() * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

// Main class to run the Bank Management System
public class Exp10 {
    public static void main(String[] args) {
        // Creating Savings and Current accounts
        SavingsAccount sa = new SavingsAccount(101, "Rahul", 10000);
        CurrentAccount ca = new CurrentAccount(102, "Anita", 20000);

        System.out.println("----- Savings Account -----");
        sa.deposit(2000);
        sa.displayDetails();
        sa.calculateInterest();

        System.out.println();

        System.out.println("----- Current Account -----");
        ca.deposit(3000);
        ca.displayDetails();
        ca.calculateInterest();
    }
}
