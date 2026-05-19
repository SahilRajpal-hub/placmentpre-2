package LLDs.LLDTheory.LLDesigns.ATM;

public class BankingService {

    public boolean validatePin(Card card,String pin) {
        return true;
    }

    public BankAccount fetchAccount(Card card) {
        return card.getAccount();
    }
}
