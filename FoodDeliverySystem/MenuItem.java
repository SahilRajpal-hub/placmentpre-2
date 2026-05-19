package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.math.BigDecimal;


// say “MenuItem availability is modeled separately to support dynamic inventory updates.”
public class MenuItem {

    private String itemId;

    private String itemName;

    private BigDecimal price;

    private boolean available;
}
