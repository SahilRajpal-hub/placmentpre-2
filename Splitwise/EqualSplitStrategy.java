package LLDs.LLDTheory.LLDesigns.Splitwise;


// say : “Split calculation algorithms may evolve independently, so strategy pattern keeps the system extensible.”
public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public void calculateSplit(Expense expense) {

        double individualAmount = expense.getAmount() / expense.getSplits().size();

        for(Split split : expense.getSplits()) {
            split.setAmount(individualAmount);
        }
    }
}
