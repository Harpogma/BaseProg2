package serie5_ex2.classes;

import java.math.BigDecimal;

public class PaypalPayment implements PaymentMethod {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }
    public void pay(BigDecimal amount, BankAccount destinationAccount) {
        destinationAccount.addToBalance(amount);
        System.out.println("This payment is in Paypal");
        System.out.println("The mail address is: " + this.email);
        System.out.println("The solde is : " + destinationAccount.getSolde());
    }
}
