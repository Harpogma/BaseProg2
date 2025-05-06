package serie5_ex2.classes;

public class PaypalPayment implements PaymentMethod {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }
    public void pay(double amount, BankAccount destinationAccount) {
        transfertMoney(amount, destinationAccount);
        System.out.println("This payment is in Paypal");
        System.out.println("The mail address is: " + this.email);
        System.out.println("The solde is : " + destinationAccount.getSolde());
    }

    public void transfertMoney(double amount, BankAccount bankAccount) {
        bankAccount.setSolde(amount);
    }
}
