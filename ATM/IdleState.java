package LLDs.LLDTheory.LLDesigns.ATM;

public class IdleState implements ATMState {

    @Override
    public void insertCard(ATM atm,Card card) {
        System.out.println("Card Inserted");

        atm.setState(new HasCardState());
    }

    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {
        throw new UnsupportedOperationException("Unimplemented method 'authenticatePin'");
    }

    @Override
    public void selectTransaction(ATM atm, TransactionType type) {
        throw new UnsupportedOperationException("Unimplemented method 'selectTransaction'");
    }

    @Override
    public void ejectCard(ATM atm) {
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }
}
