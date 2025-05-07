package serie5_ex2;

import serie5_ex2.classes.BankAccount;
import serie5_ex2.classes.BitcoinPayment;
import serie5_ex2.classes.CreditCardPayment;
import serie5_ex2.classes.PaypalPayment;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BitcoinPayment bitcoin1 = new BitcoinPayment("wallet address 1");
        CreditCardPayment cc1 = new CreditCardPayment("123456789", "greg", "2025");
        PaypalPayment paypal1 = new PaypalPayment("test@test.com");

        BigDecimal initalAccount = BigDecimal.valueOf(0.0);

        BankAccount testBankAccount = new BankAccount("8583492", initalAccount);


        BankAccount account1 = new BankAccount("12345", initalAccount);
        BankAccount account2 = new BankAccount("345678", initalAccount);

        bitcoin1.pay(new BigDecimal(300), account1);
        cc1.pay(new BigDecimal(200), account1);
        paypal1.pay(new BigDecimal(450), account2);


   }
}
