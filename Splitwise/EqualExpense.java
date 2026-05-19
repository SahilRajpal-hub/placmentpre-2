package LLDs.LLDTheory.LLDesigns.Splitwise;

import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(String expenseId,double amount,User paidBy,List<Split> splits) {
        super(expenseId,amount,paidBy,splits);
    }

    @Override
    public boolean validate() {

        return true;
    }
}
