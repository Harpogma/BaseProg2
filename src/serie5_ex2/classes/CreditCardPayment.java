package serie5_ex2.classes;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String expireDate;

    public CreditCardPayment(String cardNumber, String cardHolder, String expireDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expireDate = expireDate;
    }

    public void pay(double amount, BankAccount destinationAccount) {
        transfertMoney(amount, destinationAccount);
        System.out.println("This payment is in CreditCard");
        System.out.println("The cardNumber is: " + this.cardNumber);
        System.out.println("The cardHolder name is: " + this.cardHolder);
        System.out.println("The expire date is: " + this.expireDate);
        System.out.println("The solde is: " + destinationAccount.getSolde());
    }

    public void transfertMoney(double amount, BankAccount bankAccount) {
        bankAccount.setSolde(amount);
    }
}