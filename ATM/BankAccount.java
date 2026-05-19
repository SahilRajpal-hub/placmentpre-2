package LLDs.LLDTheory.LLDesigns.ATM;

import java.math.BigDecimal;


/*
    Using BigDecimal instead of float or double
    Because double and float are binary floating-point types, 
    and many decimal values cannot be represented exactly in binary.
*/
public class BankAccount {

    private String accountNumber;

    private BigDecimal balance;

    public void debit(BigDecimal amount) {

        if(balance.compareTo(amount) < 0) {

            throw new RuntimeException(
                "Insufficient Balance"
            );
        }

        balance = balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {

        balance = balance.add(amount);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
