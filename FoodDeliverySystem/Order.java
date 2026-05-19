package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private String orderId;

    private User user;

    private Restaurant restaurant;

    private List<MenuItem> items;

    private BigDecimal totalAmount;

    private OrderStatus status;

    private DeliveryAgent deliveryAgent;

    private Payment payment;

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }


}
