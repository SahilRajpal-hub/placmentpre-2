package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;


/*
    say : 
    “Order lifecycle is stateful, so explicit state modeling improves maintainability and correctness.
*/
public enum OrderStatus {

    CREATED,

    ACCEPTED,

    PREPARING,

    READY_FOR_PICKUP,

    OUT_FOR_DELIVERY,

    DELIVERED,

    CANCELLED
}
