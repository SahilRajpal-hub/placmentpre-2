package LLDs.LLDTheory.LLDesigns.Splitwise;

import java.util.*;


/*
    Why Abstract?

    Because validation differs:
        equal split
        exact split
        percentage split
*/
public abstract class Expense {

    protected String expenseId;

    protected double amount;

    protected User paidBy;

    protected List<Split> splits;

    public Expense(String expenseId,double amount,User paidBy,List<Split> splits) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
    }

    public abstract boolean validate();

    public double getAmount(){ return amount;}
    public List<Split> getSplits(){return this.splits;}
    public User getPaidBy(){ return paidBy;}


}
