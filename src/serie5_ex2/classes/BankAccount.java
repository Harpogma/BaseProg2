package serie5_ex2.classes;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;
    static private double interest;
    
    public BankAccount(String accountNumber, BigDecimal initialValue) {
        this.accountNumber = accountNumber;
        this.balance = initialValue;
    }

    public void addToBalance(BigDecimal amount) {
        balance.add(amount);
    }

    public BigDecimal getSolde() {
        return this.balance;
    }

        
    
}
