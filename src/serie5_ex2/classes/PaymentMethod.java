package serie5_ex2.classes;

import java.math.BigDecimal;

public interface PaymentMethod {
    void pay(BigDecimal amount, BankAccount destinationAccount) ;
}
