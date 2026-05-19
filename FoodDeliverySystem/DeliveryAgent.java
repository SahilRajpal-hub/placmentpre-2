package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

public class DeliveryAgent {

    private String agentId;

    private String name;

    private AgentStatus status;

    private Address currentLocation;

    public AgentStatus getStatus() {
        return status;
    }

    public void setStatus(AgentStatus status) {
        this.status = status;
    }

}
