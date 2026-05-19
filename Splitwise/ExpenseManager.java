package LLDs.LLDTheory.LLDesigns.Splitwise;

import java.util.*;

public class ExpenseManager {

    private Map<String, User> users;

    private List<Expense> expenses;

    public void addExpense(Expense expense) {

        if (!expense.validate()) {
            throw new RuntimeException("Invalid Expense");
        }

        User paidBy = expense.getPaidBy();

        for (Split split : expense.getSplits()) {

            User borrower = split.getUser();

            if (borrower == paidBy)
                continue;

            double amount = split.getAmount();

            // borrower owes paidBy
            paidBy.getBalances()
                    .put(
                        borrower,
                        paidBy.getBalances().getOrDefault(borrower,0.0) + amount
                    );

            // reverse balance
            borrower.getBalances()
                    .put(
                        paidBy,
                        borrower.getBalances().getOrDefault(paidBy,0.0)- amount
                    );
        }

        expenses.add(expense);
    }


    public void showBalances(User user) {

        for(Map.Entry<User, Double> entry: user.getBalances().entrySet()) {
            if(entry.getValue() > 0) {
                System.out.println(entry.getKey().getName()+ " owes "+ user.getName()+ " "+ entry.getValue());
            }
        }
    }
}


/*
    You should explain carefully:

    Example

    A pays 1000 for:

    A
    B
    C

    Equal split:

    each owes 333.33

    Meaning:

    B owes A
    C owes A

    Balances update accordingly.

*/