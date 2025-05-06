package serie5_ex2.classes;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getSolde() {
        return this.balance;
    }

    public void setSolde(double newAmount) {
        this.balance += newAmount;
    }

    
}
