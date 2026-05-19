package LLDs.LLDTheory.LLDesigns.ATM;

public class HasCardState implements ATMState {

    @Override
    public void authenticatePin(ATM atm,Card card,String pin) {

        if(isValidPin(card, pin)) {
            atm.setState(new AuthenticatedState());
        } else {
            throw new RuntimeException("Invalid PIN");
        }
    }

    @Override
    public void insertCard(ATM atm, Card card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCard'");
    }

    @Override
    public void selectTransaction(ATM atm, TransactionType type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectTransaction'");
    }

    @Override
    public void ejectCard(ATM atm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }
}
