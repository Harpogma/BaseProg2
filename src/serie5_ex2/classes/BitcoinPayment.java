package serie5_ex2.classes;

public class BitcoinPayment implements PaymentMethod {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount, BankAccount destinationAccount) {
        transfertMoney(amount, destinationAccount);
        System.out.println("This payment is in BitCoin");
        System.out.println("The wallet address is:" + this.walletAddress);
        System.out.println("The solde is : " + destinationAccount.getSolde());
    }

    public void transfertMoney(double amount, BankAccount bankAccount) {
        bankAccount.setSolde(amount);
    }
}
