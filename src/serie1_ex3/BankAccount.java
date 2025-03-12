package serie1_ex3;



public class BankAccount {
    int balance;

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

    BankAccount (int balance) {
        if (balance < 100) {
            do {
                //balance = Clavier.rend_int("Le montant doit être d'au moins 100.-. Veuillez saisir un nouveau montant : ");
                this.balance = balance;
            } while (balance < 100);
        }
    }
}
