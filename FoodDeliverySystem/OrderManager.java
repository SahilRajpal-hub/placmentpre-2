package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.util.List;

public class OrderManager {

    private DeliveryStrategy strategy;
    List<DeliveryAgent> agents;

    public Order placeOrder(User user, Restaurant restaurant, List<MenuItem> items) {

        Order order = new Order();

        order.setStatus(OrderStatus.CREATED);


        // calculate total
        


        // assign delivery agent
        // “OrderManager should orchestrate workflow, while assignment logic remains encapsulated in strategies.”
        DeliveryAgent agent = strategy.assignAgent(order,agents);

        order.setDeliveryAgent(agent);

        agent.setStatus(AgentStatus.BUSY);

        return order;
    }

    public void updateOrderStatus(Order order,OrderStatus status) {
        // valodation should happen
        // DELIVERED → PREPARING should NOT happen
        order.setStatus(status);
    }
}