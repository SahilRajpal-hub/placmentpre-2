package LLDs.LLDTheory.LLDesigns.Splitwise;


// “I’m separating split representation from expense behavior to avoid tight coupling.”
public class PercentSplit extends Split {
    private double percent;

    public PercentSplit(User user) {
        super(user);
    }
}
