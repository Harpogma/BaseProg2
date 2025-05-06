package serie5_ex2;

import serie5_ex2.classes.BankAccount;
import serie5_ex2.classes.BitcoinPayment;
import serie5_ex2.classes.CreditCardPayment;
import serie5_ex2.classes.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        BitcoinPayment bitcoin1 = new BitcoinPayment("wallet address 1");
        CreditCardPayment cc1 = new CreditCardPayment("123456789", "greg", "2025");
        PaypalPayment paypal1 = new PaypalPayment("test@test.com");


        BankAccount account1 = new BankAccount("12345", 0);
        BankAccount account2 = new BankAccount("345678", 0);

        bitcoin1.pay(300, account1);
        cc1.pay(200, account1);
        paypal1.pay(450, account2);

   }
}
