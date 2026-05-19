package LLDs.LLDTheory.LLDesigns.ATM;

import java.util.Map;


/*
    Why cashInventory?
    100 -> 10 notes
    500 -> 5 notes
    2000 -> 2 notes

    ATM must track denomination counts.
*/
public class ATM {

    private ATMState currentState;

    private int atmBalance;

    private Map<Integer, Integer> cashInventory;

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public ATMState getState() {
        return currentState;
    }
}
