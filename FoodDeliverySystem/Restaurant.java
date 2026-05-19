package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.util.*;

public class Restaurant {

    private String restaurantId;

    private String name;

    private Address address;

    private List<MenuItem> menu;

    private boolean acceptingOrders;

    public List<MenuItem> getMenu() {
        return menu;
    }
}
