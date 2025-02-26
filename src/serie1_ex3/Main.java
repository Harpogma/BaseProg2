package serie1_ex3;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.balance);
        bankAccount1.deposit(500);
        bankAccount1.withdraw(300);
        bankAccount1.withdraw(700);
    }
}
