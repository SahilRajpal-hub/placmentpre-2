package LLDs.LLDTheory.LLDesigns.Splitwise;

import java.util.List;

public class ExactExpense extends Expense {

    public ExactExpense(String expenseId,double amount,User paidBy,List<Split> splits) {
        super(expenseId,amount,paidBy,splits);
    }

    @Override
    public boolean validate() {

        double total = 0;

        for(Split split : splits) {
            total += split.getAmount();
        }

        return total == amount;
    }
}
