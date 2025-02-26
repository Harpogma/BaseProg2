package serie1_ex3;

public class BankAccount {
    int balance = 100;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit amount: " + amount);
        System.out.println("Your balance is now " + balance);
        System.out.println();
    }

    void withdraw(int amount) {
        System.out.println("Withdraw amount: " + amount);
        if (balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("You took " + amount);
            System.out.println("Your balance is now " + this.balance);
        } else {
            System.out.println("Not enough money");
            System.out.println("Balance: " + this.balance);

        }
        System.out.println();
    }
}
