package LLDs.LLDTheory.LLDesigns.Splitwise;

import java.util.*;

public class User {

    private String userId;

    private String name;

    // user -> amount owed
    //  say: “Each user maintains balances against other users for O(1) balance lookup.”
    private Map<User, Double> balances;

    public User(String userId,
                String name) {

        this.userId = userId;
        this.name = name;

        balances = new HashMap<>();
    }

    public Map<User, Double> getBalances(){ return balances;}
    public String getName(){return name;}
}

