package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.util.List;

public interface DeliveryStrategy {
    DeliveryAgent assignAgent(Order order,List<DeliveryAgent> agents);
}
