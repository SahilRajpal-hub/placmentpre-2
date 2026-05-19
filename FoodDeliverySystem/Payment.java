package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.math.BigDecimal;


/*
    At this point say:
    “Payment should remain decoupled from order workflow because payment providers and flows evolve independently.”
*/
public class Payment {

    private String paymentId;

    private BigDecimal amount;

    private PaymentStatus status;
}
