package LLDs.LLDTheory.LLDesigns.ATM;

// Chain of Responsibility pattern for cashdispenser
/*  CashDispenser
    ├── TwoThousandDispenser
    ├── FiveHundredDispenser
    └── HundredDispenser 
*/
public abstract class CashDispenser {

    protected CashDispenser next;

    public void setNext(
            CashDispenser next) {

        this.next = next;
    }

    public abstract void dispense(
            int amount);
}
