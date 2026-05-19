package LLDs.LLDTheory.LLDesigns.ATM;

public abstract class Transaction {

    protected BankAccount account;

    public abstract void execute();
}
