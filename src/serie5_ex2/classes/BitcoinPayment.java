package serie5_ex2.classes;

import java.math.BigDecimal;

public class BitcoinPayment implements PaymentMethod {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(BigDecimal amount, BankAccount destinationAccount) {
        destinationAccount.addToBalance(amount);
        System.out.println("This payment is in BitCoin");
        System.out.println("The wallet address is:" + this.walletAddress);
        System.out.println("The solde is : " + destinationAccount.getSolde());
    }
}
