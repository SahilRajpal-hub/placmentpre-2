package LLDs.LLDTheory.LLDesigns.ATM;

import java.math.BigDecimal;

// say “Transaction execution logic belongs to transaction classes instead of ATM orchestration layer.”
public class WithdrawTransaction extends Transaction {

    private BigDecimal amount;

    private CashDispenser dispenser;

    @Override
    public void execute() {

        account.debit(amount);

        dispenser.dispenseCash(amount.intValue());
    }
}
