package LLDs.LLDTheory.LLDesigns.ATM;

public interface ATMState {

    void insertCard(ATM atm,Card card);

    void authenticatePin(ATM atm,Card card,String pin);

    void selectTransaction(ATM atm,TransactionType type);

    void ejectCard(ATM atm);
}
