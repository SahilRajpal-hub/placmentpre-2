package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;


/*
    State modeling is VERY important here.
    Without status enum assignment logic becomes messy
*/
public enum AgentStatus {
    AVAILABLE,
    BUSY,
    OFFLINE
}
